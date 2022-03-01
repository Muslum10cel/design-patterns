package io.designpatterns.strategypatterntest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.designpatterns.BehavioralPatterns.strategypattern.context.Context;
import io.designpatterns.BehavioralPatterns.strategypattern.implementations.OperationAdd;
import io.designpatterns.BehavioralPatterns.strategypattern.implementations.OperationMultiply;
import io.designpatterns.BehavioralPatterns.strategypattern.implementations.OperationSubtract;

public class StrategyPatternTest {

    @Test
    public void strategyPatternTest() {

        Context context = new Context(new OperationAdd());
        assertEquals(15, context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        assertEquals(5, context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        assertEquals(50, context.executeStrategy(10, 5));

    }

}

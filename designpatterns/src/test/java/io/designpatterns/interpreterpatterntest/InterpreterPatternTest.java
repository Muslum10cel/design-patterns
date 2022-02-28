package io.designpatterns.interpreterpatterntest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.BehavioralPatterns.interpreterpattern.implementations.AndExpression;
import io.designpatterns.BehavioralPatterns.interpreterpattern.implementations.OrExpression;
import io.designpatterns.BehavioralPatterns.interpreterpattern.implementations.TerminalExpression;
import io.designpatterns.BehavioralPatterns.interpreterpattern.interfaces.Expression;


public class InterpreterPatternTest {
    
    @Test
    public void interpreterPatternTest(){
        
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        assertTrue(isMale.interpret("John"));
        assertTrue(isMarriedWoman.interpret("Married Julie"));

    }

    private Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    private Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }
}

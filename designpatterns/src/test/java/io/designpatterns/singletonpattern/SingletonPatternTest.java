package io.designpatterns.singletonpattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.CreationalPatterns.singletonpattern.SingleObject;

public class SingletonPatternTest {
    
    @Test
    public void singletonPatternTest(){
        SingleObject singleObject = SingleObject.getInstance();

        assertTrue(singleObject.getClass() == SingleObject.class);
    }

}

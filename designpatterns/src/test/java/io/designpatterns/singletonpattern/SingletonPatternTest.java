package io.designpatterns.singletonpattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SingletonPatternTest {
    
    @Test
    public void singletonPatternTest(){
        SingleObject singleObject = SingleObject.getInstance();

        assertTrue(singleObject.getClass() == SingleObject.class);
    }

}

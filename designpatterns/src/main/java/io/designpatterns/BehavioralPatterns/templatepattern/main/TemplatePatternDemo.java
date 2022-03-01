package io.designpatterns.BehavioralPatterns.templatepattern.main;

import io.designpatterns.BehavioralPatterns.templatepattern.abstracts.Game;
import io.designpatterns.BehavioralPatterns.templatepattern.implementations.Cricket;
import io.designpatterns.BehavioralPatterns.templatepattern.implementations.Football;

public class TemplatePatternDemo {
    
    public static void main(String[] args) {
        
        Game game =new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

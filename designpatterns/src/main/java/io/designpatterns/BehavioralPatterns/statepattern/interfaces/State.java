package io.designpatterns.BehavioralPatterns.statepattern.interfaces;

import io.designpatterns.BehavioralPatterns.statepattern.context.Context;

public interface State {
    
    void doAction(Context context);
}

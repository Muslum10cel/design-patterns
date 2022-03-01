package io.designpatterns.BehavioralPatterns.mementopattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

    public int getMementoSize() {
        return mementoList.size();
    }
}

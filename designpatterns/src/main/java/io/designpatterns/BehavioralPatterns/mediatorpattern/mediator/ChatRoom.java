package io.designpatterns.BehavioralPatterns.mediatorpattern.mediator;

import java.util.Date;

import io.designpatterns.BehavioralPatterns.mediatorpattern.model.User;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

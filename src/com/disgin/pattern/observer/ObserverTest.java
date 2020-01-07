package com.disgin.pattern.observer;

import java.util.LinkedList;

public class ObserverTest {
    public static void main(String[] args) {
        User user1 = new User("slc1");
        User user2 = new User("slc2");
        WeChatSubject subject = new WeChatSubject(new LinkedList<>());
        subject.register(user1);
        subject.register(user2);
        subject.sendMessage("hello");
    }
}

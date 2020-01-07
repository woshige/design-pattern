package com.disgin.pattern.observer;

import java.util.LinkedList;

public class WeChatSubject implements Subject {
    private LinkedList<Observer> list;
    private String message;

    public WeChatSubject(LinkedList<Observer> list) {
        this.list = list;
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void sendMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}

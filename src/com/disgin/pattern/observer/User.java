package com.disgin.pattern.observer;

public class User implements Observer {
    private String message;
    private String username;
    public User(String username){
        this.username = username;
    }
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
    public void read(){
        System.out.println("receive from wechat-server" + message);
    }
}

package com.java.observer;

public class Team2 implements ITeam {
    @Override
    public void update(Message message) {
        System.out.println(message);
    }
}

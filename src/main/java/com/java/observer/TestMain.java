package com.java.observer;

public class TestMain {
    public static void main(String[] args) {
        ITeam team=new Team1();
        team.update(new Message("1 team added"));
        ITeam team1=new Team2();
        team1.update(new Message("team 2 added"));
        MessagePublisher messagePublisher=new MessagePublisher();
        messagePublisher.addTeam(team);
        messagePublisher.notifyTeam();
    }
}

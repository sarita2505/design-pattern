package com.java.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher {
    private ITeam team;
    private Message message;
    List<ITeam> teams=new ArrayList<>();
    public void addTeam(ITeam team){
        teams.add(team);
    }
    public void removeTeam(ITeam team){
        teams.remove(team);
    }
    public void notifyTeam() {
        for (ITeam team:teams){
            team.update(message);
        }
    }
}

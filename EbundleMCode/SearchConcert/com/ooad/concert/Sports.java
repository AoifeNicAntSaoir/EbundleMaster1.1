package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class Sports extends Event {
    protected SportsType sportsType;
    protected String team;

    public Sports(EventSpec eventSpec, int eventId, double price,
                   SportsType sportsType, String team){
        super(eventSpec, eventId, price);
        this.sportsType = sportsType;
        this.team = team;
    }

    public SportsType getSportsType() {
        return sportsType;
    }

    public void setSportsType(SportsType sportsType) {
        this.sportsType = sportsType;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        team = team;
    }

}

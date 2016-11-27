package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class Sports extends Event {
    SportsType sportsType;
    String team;

    public Sports(int eventId, EventClass type,
                  Venue venue, Calendar date, double price,
                  SportsType sportsType, String team){
        super(eventId, type, venue, date, price);
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

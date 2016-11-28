package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class Sports extends EventSpec {
    SportsType sportsType;
    String team;

    public Sports(int eventId, EventClass type,
                  Venue venue, Calendar date, double price,
                  String act, String actDescription,
                  SportsType sportsType, String team){
        super(eventId, type, venue, date, price, act, actDescription);
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

    //Overrides from the super class
    @Override
    public boolean matches(EventSpec otherSpec){
        if(!super.matcher.ma)
    }

}

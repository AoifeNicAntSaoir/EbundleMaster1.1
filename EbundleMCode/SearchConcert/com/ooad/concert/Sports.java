package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class Sports extends Event {
    String sportsType; //Enum
    String team;

    public Sports(int eventId, EventClass type,
                  Venue venue, Calendar date, double price,
                  String sportsType, String team){
        super(eventId, type, venue, date, price);
        this.sportsType = sportsType;
        this.team = team;
    }

    public String getSportsType() {
        return sportsType;
    }

    public void setSportsType(String sportsType) {
        this.sportsType = sportsType;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        team = team;
    }


}

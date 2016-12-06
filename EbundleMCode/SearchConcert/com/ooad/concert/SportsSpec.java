package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class SportsSpec extends EventSpec {
    protected SportsType sportsType;
    protected String team;

    public SportsSpec(String act,  EventClass eventType,
                      Venue venue, int eventId, SportsType sportsType,
                      String team){
        super(act,eventType,venue);
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

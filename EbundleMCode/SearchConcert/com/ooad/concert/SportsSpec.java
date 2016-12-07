package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class SportsSpec extends EventSpec {
    final SportsType sportsType;

    public SportsSpec(String act,  EventClass eventType,
                      Venue venue, int eventId, SportsType sportsType){
        super(act,eventType,venue);
        this.sportsType = sportsType;
    }

    public SportsType getSportsType() {
        return sportsType;
    }

    public void setTeam(String team) {
        team = team;
    }

    @Override
    public boolean matches(final EventSpec otherSpec) {
        if (!(otherSpec instanceof SportsSpec))
            return false;
        if (!super.matches(otherSpec))
            return false;
        SportsSpec spec = (SportsSpec)otherSpec;
        return sportsType.equals(spec.sportsType);
    }



}

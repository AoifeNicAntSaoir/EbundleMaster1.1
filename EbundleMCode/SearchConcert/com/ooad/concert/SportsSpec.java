package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class SportsSpec extends EventSpec {

    protected SportsType sportsType;

    public SportsSpec(final String act,
                      final EventClass eventType,
                      final Venue venue,
                      final int eventId,
                      final SportsType sportsType,
                      final String team){
        super(act,eventType,venue);
        this.sportsType = sportsType;
    }

    public SportsType getSportsType() {
        return sportsType;
    }

    @Override
    public boolean matches(final EventSpec otherSpec) {
        if (!(otherSpec instanceof SportsSpec))
            return false;
        if (!super.matches(otherSpec))
            return false;
        SportsSpec spec = (SportsSpec)otherSpec;
        return sportsType == spec.sportsType;
    }

}

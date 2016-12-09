package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class ComedySpec extends EventSpec {

    protected String comedian;

    public ComedySpec(final String act,
                      final EventClass eventType,
                      final Venue venue,
                      final int eventId,
                      final String comedian){
        super(act, eventType, venue);
        this.comedian = comedian;
    }

    public String getComedian(){
        return comedian;
    }

    @Override
    public boolean matches(final EventSpec otherSpec) {
        if (!(otherSpec instanceof ComedySpec))
            return false;
        if (!super.matches(otherSpec))
            return false;
        ComedySpec spec = (ComedySpec)otherSpec;
        return comedian == spec.comedian;
    }



}

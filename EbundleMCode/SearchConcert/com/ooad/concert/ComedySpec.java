package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class ComedySpec extends EventSpec {

    protected String comedian;

    public ComedySpec(String act, EventClass eventType, Venue venue,
                      final int eventId, final String comedian){
        super(act, eventType, venue);
        this.comedian = comedian;
    }

    public String getComedian(){
        return comedian;
    }

    public void setComedian(String comedian){
        this.comedian = comedian;
    }


}

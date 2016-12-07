package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class Sports extends Event {

    private SportsSpec sportsSpec;

    public Sports(final EventSpec eventSpec,
                   int eventId,
                   double price){
        super(eventSpec, eventId, price);
        this.sportsSpec = sportsSpec;

    }
}

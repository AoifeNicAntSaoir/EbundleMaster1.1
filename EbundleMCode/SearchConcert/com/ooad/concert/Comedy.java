package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class Comedy extends Event {

    private ComedySpec comedySpec;

    public Comedy(final EventSpec eventSpec,
                   int eventId,
                   double price){
        super(eventSpec, eventId, price);
        this.comedySpec = comedySpec;
    }
}

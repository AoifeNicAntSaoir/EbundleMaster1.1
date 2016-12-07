package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class ArtsTheatre extends Event {

    private ArtsSpec artsSpec;

    public ArtsTheatre(final EventSpec eventSpec,
                   int eventId,
                   double price){
        super(eventSpec, eventId, price);
        this.artsSpec = artsSpec;

    }


}

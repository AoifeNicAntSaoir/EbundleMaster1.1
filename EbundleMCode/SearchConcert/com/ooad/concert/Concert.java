package com.ooad.concert;

import java.util.List;

/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert extends Event {

    private ConcertSpec concertSpec;

    public Concert(final EventSpec eventSpec,
                   int eventId,
                   double price){
        super(eventSpec, eventId, price);
        this.concertSpec = concertSpec;

    }



    public ConcertSpec getConcertSpec() {
        return concertSpec;
    }

    public void setConcertSpec(ConcertSpec concertSpec) {
        this.concertSpec = concertSpec;
    }




}
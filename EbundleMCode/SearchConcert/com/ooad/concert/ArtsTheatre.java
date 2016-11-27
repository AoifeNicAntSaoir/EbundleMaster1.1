package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class ArtsTheatre extends Event {
    private ArtType artType;

    public ArtsTheatre(int eventId, EventClass type,
                       Venue venue, Calendar date, double price,
                       ArtType artType)
    {
        super(eventId, type, venue, date, price);
        this.artType = artType;
    }

    public ArtType getArtType() {
        return artType;
    }

    public void setArtType(ArtType artType) {
        this.artType = artType;
    }



}

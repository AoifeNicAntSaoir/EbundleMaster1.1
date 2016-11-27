package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class ArtsTheatre extends Event {
    private String artType;

    public ArtsTheatre(int eventId, EventClass type,
                       Venue venue, Calendar date, double price,
                       String artType)
    {
        super(eventId, type, venue, date, price);
        this.artType = artType;
    }

    public String getArtType() {
        return artType;
    }

    public void setArtType(String artType) {
        this.artType = artType;
    }



}

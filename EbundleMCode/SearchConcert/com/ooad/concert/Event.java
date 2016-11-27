package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public abstract class Event {

    //Type - concert/ sports/ arts & theatre, comedy


    protected EventClass type;
    protected Genre genre;
    protected Venue venue;
    protected Calendar date;
    protected double price;


    public EventClass getType() {
        return type;
    }

    public void setType(EventClass type) {
        this.type = type;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }




}

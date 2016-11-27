package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public abstract class Event {

    //Type - concert/ sports/ arts & theatre, comedy

    protected int eventId;
    protected EventClass type;
    protected Venue venue;
    protected Calendar date;
    protected double price;
    protected String act;
    protected String actDescription;

    public Event(int eventId, EventClass type,
                 Venue venue, Calendar date, double price,
                String act, String actDescription)
    {
        this.eventId = eventId;
        this.type = type;
        this.venue = venue;
        this.date = date;
        this.price = price;
        this.act = act;
        this.actDescription = actDescription;
    }

    public Event(){
        this(0,EventClass.ARTSnTHEATRE, Venue.THEMARQUEE, Calendar.getInstance(), 0.00, null, null);
    }


    public EventClass getType() {
        return type;
    }

    public void setType(EventClass type) {
        this.type = type;
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

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getActDescription() {
        return actDescription;
    }

    public void setActDescription(String actDescription) {
        this.actDescription = actDescription;
    }






}

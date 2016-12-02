package com.ooad.concert;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Aoife Sayers on 28/11/2016.
 */
public class EventSpec{

    public String act;
    public EventClass type;
    public Venue venue;
    public Calendar date;
    public double price;

    public EventSpec(String act, EventClass eventType, Venue venue, Calendar date, double price)
    {
        this.act = act;
        this.type = eventType;
        this.venue = venue;
        this.date = date;
        this.price = price;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public EventClass getEventClass() {
        return type;
    }

    public void setEventClass(EventClass type) {
        this.type = type;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Calendar getDate() {
        return Calendar.getInstance();
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public boolean matches(EventSpec anEvent) {
        if (isSpecified(anEvent.getAct())) {
            return this.act.equalsIgnoreCase(anEvent.getAct());
        }
        if (isSpecified(anEvent.getVenue())) {
            return this.venue == anEvent.getVenue();
        }

        if (isSpecified(anEvent.getEventClass())) {
            return this.date == anEvent.getDate();
        }

        if (isSpecified(anEvent.getDate())) {
            return this.date == anEvent.getDate();
        }
        return true;
    }



    private boolean isSpecified(Object field){
        return field!=null;
    }


}

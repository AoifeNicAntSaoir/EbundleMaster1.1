package com.ooad.concert;

import java.text.DecimalFormat;
import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public abstract class Event {

    //Type - concert/ sports/ arts & theatre, comedy

    protected EventSpec eventSpec;
    protected int eventId;
    protected double price;


    public Event(EventSpec eventSpec, int eventId, double price)
    {
        this.eventSpec = eventSpec;
        this.eventId = eventId;
        this.price = price;
    }

    public EventSpec getEventSpec(){
        return eventSpec;
    }
    public void setEventSpec(EventSpec eventSpec) {
        this.eventSpec = eventSpec;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public double getPrice() {
        DecimalFormat df2 = new DecimalFormat(".##");
        return Double.parseDouble(df2.format(price));
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

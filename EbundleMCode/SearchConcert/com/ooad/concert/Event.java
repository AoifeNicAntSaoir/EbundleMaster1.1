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

    //Added this for the event spec
    public Event(EventSpec eventSpec,int eventId, double price) {
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

}

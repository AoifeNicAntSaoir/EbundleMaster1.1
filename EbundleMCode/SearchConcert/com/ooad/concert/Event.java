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

    //Added this for the event spec
    public Event(int eventId) {
        this.eventId = eventId;

    }

    public Event(EventSpec eventSpec, int eventId) {
        this.eventSpec = eventSpec;
        this.eventId = eventId;
    }


    public EventSpec getEventSpec() {
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

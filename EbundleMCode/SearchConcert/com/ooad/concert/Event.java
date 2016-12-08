package com.ooad.concert;
/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public abstract class Event {

    //Type - concert/ sports/ arts & theatre, comedy

    protected final EventSpec eventSpec;
    protected final int eventId;
    protected double price;

    //Added this for the event spec
    public Event(EventSpec eventSpec, int eventId, double price) {
        this.eventSpec = eventSpec;
        this.eventId = eventId;
        this.price = price;

    }

    public EventSpec getEventSpec(){
        return eventSpec;
    }


    public int getEventId() {
        return eventId;
    }


}

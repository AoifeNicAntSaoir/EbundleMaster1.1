package com.ooad.concert;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Aoife Sayers on 28/11/2016.
 */
public abstract class EventSpec {

    final String act;
    final EventClass type;
    final Venue venue;

    public EventSpec(String act, EventClass eventType, Venue venue)
    {
        this.act = act;
        this.type = eventType;
        this.venue = venue;
    }


    public String getAct() {
        return act;
    }

    public EventClass getEventClass() {
        return type;
    }

    public Venue getVenue() {
        return venue;
    }



    public boolean matches(EventSpec anEvent) {

        if (isActSpecified(anEvent)) {
            return this.act.equalsIgnoreCase(anEvent.getAct());
        }
        if (isSpecified(anEvent.getVenue())) {
            return this.venue == anEvent.getVenue();
        }

        if(isSpecified((anEvent.getEventClass()))){
            return this.type.equals(anEvent.getEventClass());
        }
        return true;
    }



    private boolean isSpecified(Object field){
        return field!=null;
    }


    private boolean isActSpecified(EventSpec otherEvent) {
        return (otherEvent.getAct() != null)
                && (!otherEvent.getAct().equals(""));
    }
}

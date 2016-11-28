package com.ooad.concert;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Aoife Sayers on 28/11/2016.
 */
public abstract class EventSpec {

    protected String act;
    protected String actDescription;
    protected EventClass type;
    protected Venue venue;
    protected Calendar date;

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
        if (isSpecified(anEvent.getActDescription())) {
            return this.actDescription.equalsIgnoreCase(anEvent.getActDescription());
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

package com.ooad.concert;


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

    public EventSpec()
    {
        this("Unknown Act", EventClass.CONCERT, Venue.AVIVASTADIUM);
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
            return this.act.equals(anEvent.getAct());
        }
        if (isSpecified(anEvent.getVenue())) {
            return this.venue == anEvent.getVenue();
        }

        if(isSpecified((anEvent.getEventClass()))){
            return this.type == anEvent.getEventClass();
        }


        return true;
    }


    private boolean isActSpecified(EventSpec anEvent) {
        return (anEvent.getAct() != null)
                && (!anEvent.getAct().equals(""));
    }

    private boolean isSpecified(Object field){
        return field!=null;
    }


}

package com.ooad.concert;

import java.util.ArrayList;
import java.util.List;

public class EventCatalogue {
    protected List<Event> eventCatalogue;

    public EventCatalogue(ArrayList<Event> eventCatalogue){
        this.eventCatalogue = eventCatalogue;
    }

    public void addEvent(EventSpec eventSpec, int eventId, double price){
        Event event;
        if(eventSpec instanceof ConcertSpec){
            event = new Concert((ConcertSpec)eventSpec,eventId,price);
        }
        else if(eventSpec instanceof ArtsSpec )
        {
            event = new ArtsTheatre((ArtsSpec)eventSpec,eventId, price);
        }
        else if(eventSpec instanceof ComedySpec)
        {
            event = new Comedy((ComedySpec)eventSpec, eventId,price);
        }
        else if(eventSpec instanceof SportsSpec)
        {
            event = new Sports((SportsSpec)eventSpec, eventId,price);

        }
    }

    public Event getEvent(int eventId) {
        for (Event event : eventCatalogue) {
            if (event.getEventId() == eventId){
                return event;
            }
        }
        return null;
    }


    public List<Event> search(EventSpec spec) {
        List<Event> matchingEvent = new ArrayList<>();
        for (Event event : eventCatalogue) {
            EventSpec eventSpec = event.getEventSpec();
            if (eventSpec.matches(spec)) {
                eventCatalogue.add(event);
            }
        }
        return matchingEvent;
    }


    public List<Event> searchEvent(EventSpec spec) {
        List<Event> matchingEvent = new ArrayList<>();
        for (Event event : eventCatalogue) {
            EventSpec eventSpec = event.getEventSpec();
            if (eventSpec.matches(spec)) {
                eventCatalogue.add(event);
            }
        }
        return matchingEvent;
    }

}
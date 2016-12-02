package com.ooad.concert;
import java.util.ArrayList;
import java.util.List;

public class EventCatalogue {
    protected final List<Event> eventCatalogue;


    public EventCatalogue(List<Event> eventCatalogue) {
        this.eventCatalogue = eventCatalogue;
    }

    public void addEvent(EventSpec eventSpec, int eventId, double price, ArtType artType, String comedian,
                         int concertId, Genre genre, SportsType sportsType, String team) {
            Event event;
            if(eventSpec.getEventClass() == EventClass.ARTSnTHEATRE){
                event = new ArtsTheatre(eventSpec, eventId, price, artType);
                eventCatalogue.add(event);
        }
        else if(eventSpec.getEventClass() == EventClass.COMEDY){
            event = new Comedy(eventSpec, eventId, price, comedian);
        }
        else if(eventSpec.getEventClass() == EventClass.CONCERT){
            event = new Concert(eventSpec, eventId, price, concertId, genre);

        }
        else if(eventSpec.getEventClass() == EventClass.SPORTS){
            event = new Sports(eventSpec, eventId, price, sportsType, team);

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
}
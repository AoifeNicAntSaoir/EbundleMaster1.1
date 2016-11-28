package com.ooad.concert;
import java.util.ArrayList;
import java.util.List;

public class ConcertCatalogue {
    protected final List<Event> eventCatalogue;

    protected final List<Concert> concertCatalogue;
    protected final List<ArtsTheatre> artsTheatreCatalogue;
    protected final List<Comedy> comedyCatalogue;
    protected final List<Sports> sportsCatalogue;


    public ConcertCatalogue(List<Event> eventCatalogue) {
        this.eventCatalogue = eventCatalogue;

        concertCatalogue = new ArrayList<Concert>(); //Type Inference
        artsTheatreCatalogue = new ArrayList<ArtsTheatre>();
        comedyCatalogue = new ArrayList<Comedy>();
        sportsCatalogue = new ArrayList<Sports>();

    }

    public void addEvent(EventSpec eventSpec, int eventId, double price, ArtType artType, String comedian,
                         int concertId, Genre genre, SportsType sportsType, String team) {
        Event event;
        if(eventSpec.getEventClass() == EventClass.ARTSnTHEATRE){
            event = new ArtsTheatre(eventSpec, eventId, price, artType);
            eventCatalogue.add(event);
            //artsTheatreCatalogue.add(e);

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
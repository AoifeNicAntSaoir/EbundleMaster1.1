package com.ooad.concert;
import javafx.scene.effect.Light;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EventCatalogue {
    protected final List<Event> eventCatalogue;
    protected final List<Concert> concertCatalogue;
    protected final List<Comedy> comedyCatalogue;
    protected final List<ArtsTheatre> artsTheatreCatalogue;
    protected final List<Sports> sportsCatalogue;


    public EventCatalogue(List<Event> eventCatalogue, List<Concert> concertCatalogue, List<Comedy> comedyCatalogue,
                          List<ArtsTheatre> artsTheatreCatalogue, List<Sports> sportsCatalogue) {
        this.eventCatalogue = eventCatalogue;
        this.concertCatalogue = concertCatalogue;
        this.comedyCatalogue = comedyCatalogue;
        this.artsTheatreCatalogue = artsTheatreCatalogue;
        this.sportsCatalogue = sportsCatalogue;
    }


    public void addConcert(EventSpec eventSpec, int eventId, int concertID, Genre genre){
        Concert newConcert = new Concert(eventSpec, eventId, concertID,genre);
        eventCatalogue.add(newConcert);
        concertCatalogue.add(newConcert);
    }

    public void addComedy(EventSpec eventSpec, int eventId, String comedian){
        Comedy newComedy = new Comedy(eventSpec, eventId, comedian);
        eventCatalogue.add(newComedy);
        comedyCatalogue.add(newComedy);
    }

    public void addArtsTheatre(EventSpec eventSpec, int eventId, ArtType artType){
        ArtsTheatre newArtTheatre = new ArtsTheatre(eventSpec,eventId,artType);
        eventCatalogue.add(newArtTheatre);
        artsTheatreCatalogue.add(newArtTheatre);
    }

    public void addSports(EventSpec eventSpec, int eventId,
                          SportsType sportsType, String team){
        Sports newSport = new Sports(eventSpec, eventId, sportsType, team);
    }


    public Event getEvent(int eventId) {
        for (Event event : eventCatalogue) {
            if (event.getEventId() == eventId){
                return event;
            }
        }
        return null;
    }

    public 

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
package com.ooad.concert;
import javafx.scene.effect.Light;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
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

                  //String act, EventClass eventType, Venue venue, Calendar date, double price
    public void addConcert(String act, Venue venue, int eventId, double price, int concertID, Genre genre){
        Concert newConcert = new Concert(new EventSpec(act,EventClass.CONCERT, venue, Calendar.getInstance(), price), eventId, concertID,genre);
        eventCatalogue.add(newConcert);
        concertCatalogue.add(newConcert);
    }

    public void addComedy(String act, Venue venue, double price, int eventId, String comedian){
        Comedy newComedy = new Comedy(new EventSpec(act, EventClass.COMEDY, venue, Calendar.getInstance(), price), eventId, comedian);
        eventCatalogue.add(newComedy);
        comedyCatalogue.add(newComedy);
    }

    public void addArtsTheatre(String act, Venue venue, double price, int eventId, ArtType artType){
        ArtsTheatre newArtTheatre = new ArtsTheatre(new EventSpec(act, EventClass.ARTSnTHEATRE, venue, Calendar.getInstance(), price),eventId,artType);
        eventCatalogue.add(newArtTheatre);
        artsTheatreCatalogue.add(newArtTheatre);
    }

    public void addSports(String act, Venue venue, double price, int eventId,
                          SportsType sportsType, String team){
        Sports newSport = new Sports(new EventSpec(act, EventClass.SPORTS,venue, Calendar.getInstance(), price), eventId, sportsType, team);
        eventCatalogue.add(newSport);
        sportsCatalogue.add(newSport);
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


    public List<Concert> searchConcert(EventSpec spec) {
        List<Concert> matchingEvent = new ArrayList<>();
        for (Concert event : concertCatalogue) {
            EventSpec eventSpec = event.getEventSpec();
            if (eventSpec.matches(spec)) {
                concertCatalogue.add(event);
            }
        }
        return matchingEvent;
    }

    public List<ArtsTheatre> searchArtTheatre(EventSpec spec) {
        List<ArtsTheatre> matchingEvent = new ArrayList<>();
        for (ArtsTheatre event : artsTheatreCatalogue) {
            EventSpec eventSpec = event.getEventSpec();
            if (eventSpec.matches(spec)) {
                artsTheatreCatalogue.add(event);
            }
        }
        return matchingEvent;
    }

    public List<Comedy> searchComedy(EventSpec spec) {
        List<Comedy> matchingEvent = new ArrayList<>();
        for (Comedy event : comedyCatalogue) {
            EventSpec eventSpec = event.getEventSpec();
            if (eventSpec.matches(spec)) {
                comedyCatalogue.add(event);
            }
        }
        return matchingEvent;
    }

    public List<Sports> searchSports(EventSpec spec) {
        List<Sports> matchingEvent = new ArrayList<>();
        for (Sports event : sportsCatalogue) {
            EventSpec eventSpec = event.getEventSpec();
            if (eventSpec.matches(spec)) {
                sportsCatalogue.add(event);
            }
        }
        return matchingEvent;
    }
}
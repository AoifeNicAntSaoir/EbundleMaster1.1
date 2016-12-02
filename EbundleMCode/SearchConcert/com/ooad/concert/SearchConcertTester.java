package com.ooad.concert;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class SearchConcertTester {

    public static void main(String[] args) {
        // Set up catalogue
        EventCatalogue catalogue = new EventCatalogue(new ArrayList<Event>(), new ArrayList<Concert>(), new ArrayList<Comedy>(),
                new ArrayList<ArtsTheatre>(),  new ArrayList<Sports>());


        initialiseEvents(catalogue);

        catalogue.search(new EventSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance(), 0.00));



        System.out.println("\nLooking for an Ariana Grande Concert...");

    }


    private static void findMatching(final EventCatalogue catalogue, final EventSpec whatErinLikes) {
        List<Event> matchingEvents = catalogue.search(whatErinLikes);
        if (!matchingEvents.isEmpty()) {
            for (Event match : matchingEvents) {
                if (match != null) {
                    EventSpec eventSpec = match.getEventSpec();
                    System.out.println("Erin, you might like this " +
                            eventSpec.getAct() +
                            eventSpec.getVenue() +
                            eventSpec.getEventClass() +
                            eventSpec.getDate() +
                    eventSpec.getPrice());

                }
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }



    private static void initialiseEvents(EventCatalogue catalogue) {

        






    }


}
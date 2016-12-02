package com.ooad.concert;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class SearchConcertTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        EventCatalogue catalogue = new EventCatalogue(new LinkedList<>());
        initialiseEvents(catalogue);

        catalogue.search(new EventSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance(), 0.00));
     //   catalogue.findMatching(new EventSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance(), 0.00));
               // Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));


        System.out.println("\nLooking for a mandolin...");

        //EventCatalogue cc = new EventCatalogue();

        //cc.search(new E)


               // findMatching(

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

            Calendar date = Calendar.getInstance();

        /*EventSpec eventSpec, int eventId, double price,
                         ArtType artType, String comedian,int concertId,Genre genre,
                         SportsType sportsType, String team*/

        /*String act, EventClass eventType, Venue venue, Calendar date, double price*/

        catalogue.addEvent(new EventSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance(), 45.50),
                            1234, 4, Genre.POP, SportsType.BASKETBALL, "Joiejaka");


        catalogue.addEvent();




    }


}
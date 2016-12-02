package com.ooad.concert;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class SearchConcertTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        EventCatalogue catalogue = new EventCatalogue(new LinkedList<>());
        initialiseEvents(catalogue);

       /* findMatching(new EventCatalogue(event));

        String act, EventClass eventType, Venue venue, Calendar date, double price*/

        findMatching(new EventSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance(), 0.00));
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


        //Concerts
        catalogue.addEvent(new EventSpec("Ariana Grande", "Github all day... Github all night",
                            EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance()),1234, 45.50);

        catalogue.addEvent(new EventSpec("The Weeknd", "I can't feel my face",
                EventClass.CONCERT, Venue.CROKEPARK, Calendar.getInstance()),2345, 50.50);

        catalogue.addEvent(new EventSpec("", "Github all day... Github all night",
                EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance()),1234, 45.50);

        catalogue.addEvent(new EventSpec("Ariana Grande", "Github all day... Github all night",
                EventClass.CONCERT, Venue.THREEARENA, Calendar.getInstance()),1234, 45.50);


    }


}
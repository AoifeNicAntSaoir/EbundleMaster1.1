package com.ooad.concert;

import java.util.ArrayList;
import java.util.List;

public class SearchConcertTester {

    public static void main(String[] args) {

        EventCatalogue catalogue = new EventCatalogue(new ArrayList<Event>());

       initialiseEvents(catalogue);

        System.out.println("\nLooking for an Ariana Grande Concert...");
        findMatching(catalogue, new ConcertSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Genre.POP));



    }


    private static void findMatching(final EventCatalogue catalogue, final EventSpec whatOwenLikes) {
        List<Event> matchingEvents = catalogue.searchEvent(whatOwenLikes);
        if (!matchingEvents.isEmpty()) {
            for (Event match : matchingEvents) {
                if (match != null) {
                    EventSpec eventSpec = match.getEventSpec();
                    System.out.println("Owen, you might like this " +
                            eventSpec.getAct() +
                            eventSpec.getVenue() +
                            eventSpec.getEventClass());

                }
            }
        } else {
            System.out.println("Sorry, Owen, we have nothing for you.");
        }
    }



    private static void initialiseEvents(EventCatalogue catalogue) {

        //Concerts
        catalogue.addEvent(new ConcertSpec("Ariana Grande", EventClass.CONCERT, Venue.THREEARENA, Genre.POP),120,50.90);
        catalogue.addEvent(new ConcertSpec("Lower Than Atlantis", EventClass.CONCERT, Venue.THREEARENA, Genre.ALTERNATIVE),120,50.90);
        catalogue.addEvent(new ConcertSpec("The Weeknd", EventClass.CONCERT,Venue.CROKEPARK,Genre.RNB),193,63.90);
        catalogue.addEvent(new ConcertSpec("Oliver Helednes", EventClass.CONCERT,Venue.AVIVASTADIUM, Genre.DANCE),29393,50.50);
        catalogue.addEvent(new ConcertSpec("The Coronas", EventClass.CONCERT, Venue.INEC, Genre.INDIE),39393, 50.90);
        catalogue.addEvent(new ConcertSpec("Nathan Carter", EventClass.CONCERT,Venue.INEC, Genre.COUNTRY), 393939, 50.90);

        //Arts & Theatre
        catalogue.addEvent(new ArtsSpec("The Field", EventClass.ARTSnTHEATRE, Venue.SIAMSATIRE, 1234, ArtsType.DRAMA),3939, 50.90);
        catalogue.addEvent(new ArtsSpec("High School Musical", EventClass.ARTSnTHEATRE, Venue.OLYMPIATHEATRE, 239, ArtsType.MUSICALS), 2339, 30.50);
        catalogue.addEvent(new ArtsSpec("The Wind That Shakes the Barley", EventClass.ARTSnTHEATRE, Venue.INEC, 22230, ArtsType.FILM), 3939, 20.50);

        //Comedy
        catalogue.addEvent(new ComedySpec("Gift Grub Live - Mario Rosenstock", EventClass.COMEDY,Venue.INEC,3939,"Mario Rosenstock"),23993, 20.90);
        catalogue.addEvent(new ComedySpec("Under The Influence - Tommy Tiernan ", EventClass.COMEDY, Venue.SIAMSATIRE,3030,"Tommy Tiernan"),23939, 30.50);
        catalogue.addEvent(new ComedySpec("Dara O'Brian", EventClass.COMEDY, Venue.AVIVASTADIUM, 3230, "Dara O'Brian"),312020, 50.90);

        //Sports
        catalogue.addEvent(new SportsSpec("All Ireland Final",EventClass.SPORTS,Venue.CROKEPARK,1234,SportsType.GAA), 1922, 90.50);
        catalogue.addEvent(new SportsSpec("UFC 33939",EventClass.SPORTS,Venue.AVIVASTADIUM,3933,SportsType.MARTIALARTS), 339, 120.50);
        catalogue.addEvent(new SportsSpec("Rugby World Cup Semi-Final",EventClass.SPORTS,Venue.CROKEPARK,3939,SportsType.RUGBY),3320,50.90);
    }


}
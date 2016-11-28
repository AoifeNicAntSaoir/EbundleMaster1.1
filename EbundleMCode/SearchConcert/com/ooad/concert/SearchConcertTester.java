package com.ooad.concert;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Aoife Sayers on 21/11/2016.
 */
public class SearchConcertTester {
    public static void main(String[] args) {

        ConcertCatalogue catalogue = new ConcertCatalogue(new LinkedList<>());
        initialiseEvents(catalogue);


        findMatching(inventory, new Concert(1,EventClass.CONCERT));

         private static void findMatching(final ConcertCatalogue catalogue, final Concert whatUserWants)
        {
            List<Event> matchingEvent = catalogue.search(whatUserWants);

        if (concert != null) {
            Event event = concert.getSpec();
            System.out.println("Erin you might like this " +
                    concert.getConcertID() + " " + concert.getAct() +
                    " \n" + concert.getActDescription() +
                    " on the " + concert.getDate() + " in the" +
                    concert.getVenue());
        } else {
            System.out.println("Sorry Erin, we have nothing for you");
        }
    }


    private static void initialiseEvents(ConcertCatalogue catalogue) {

            Calendar date = Calendar.getInstance();

        catalogue.addConcert(12345, Genre.COUNTRY, Venue.INEC, date, "Daniel O'Donnell", "A wee thick country vegetable!");

        catalogue.addConcert(2468, Genre.ALTERNATIVE, Venue.OLYMPIATHEATRE, date, "Lower Than Atlantis", "An English band");

        catalogue.addConcert(39393, Genre.REGGAE, Venue.MARLAYPARK, date, "Bob Marley", "Jammin");

        catalogue.addConcert(20292, Genre.INDIE, Venue.OLYMPIATHEATRE, date, "Catfish and the Bottlemen", "Up and coming band 2016");

        catalogue.addConcert(94823, Genre.POP, Venue.THREEARENA, date, "Bastille", "Alternative pop band");

        catalogue.addConcert(22920, Genre.DANCE, Venue.MARLAYPARK, date, "Disclosure", "Dance act..");

        catalogue.addConcert(394399, Genre.RNB, Venue.AVIVASTADIUM, date, "The Weeknd", "Starboy..");

        catalogue.addConcert(23422, Genre.POP, Venue.THEMARQUEE, date, "Ariana Grande", "Github all day... Github all night");

    }


}
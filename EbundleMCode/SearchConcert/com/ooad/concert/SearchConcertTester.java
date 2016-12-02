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
        //Concerts
        catalogue.addConcert("Ariana Grande", Venue.THREEARENA,1234,50.45, 5412, Genre.POP);
        catalogue.addConcert("Arctic Monkeys", Venue.THEMARQUEE, 2345, 30.90, 2393, Genre.INDIE);
        catalogue.addConcert("Lower Than Atlantis",Venue.OLYMPIATHEATRE, 3939, 30.50, 2939, Genre.ROCK);
        catalogue.addConcert("Nathan Carter", Venue.INEC, 3939, 20.90, 39939, Genre.COUNTRY);
        catalogue.addConcert("The Weeknd", Venue.CROKEPARK, 38739, 70.90, 887, Genre.RNB);

        catalogue.addArtsTheatre("Alice in Wonderland", Venue.INEC, 23.80, 32343, ArtType.MUSICALS);
        catalogue.addArtsTheatre("The Black Swan", Venue.SIAMSATIRE, 32.80, 322, ArtType.BALLET);
        catalogue.addArtsTheatre("Step Up 9", Venue.INEC, 32.80, 322, ArtType.DANCE);
        catalogue.addArtsTheatre("The Field", Venue.OLYMPIATHEATRE, 32.80, 322, ArtType.DRAMA);

        catalogue.addComedy("Gift Grub live Mario Rosenstock", Venue.INEC, 10.50, 3932, "Mario Rosenstock");
        catalogue.addComedy("Republic of Telly", Venue.INEC, 15.50, 233, "Neil Delamere");

        catalogue.addSports("The All Ireland Final", Venue.CROKEPARK, 80.50, 2393, SportsType.GAA, "Kerry vs Dublin");
        catalogue.addSports("UFC", Venue.THREEARENA, 120.50, 2393, SportsType.MARTIALARTS, "McGregor vs Diaz");
        





    }


}
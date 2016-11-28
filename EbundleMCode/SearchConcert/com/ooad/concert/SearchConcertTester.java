package com.ooad.concert;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;


    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        ConcertCatalogue catalogue = new ConcertCatalogue(new LinkedList<>());
        initialiseEvents(catalogue);

        findMatching(catalogue, new Concert
                Venue.THEMARQUEE, Calendar.getInstance(),  ), "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));

        System.out.println("\nLooking for a mandolin...");


        findMatching(inventory, new MandolinSpec(Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, Style.F));

    }

    private static void findMatching(final Inventory inventory, final InstrumentSpec whatErinLikes) {
        List<Instrument> matchingInstruments = inventory.search(whatErinLikes);
        if (!matchingInstruments.isEmpty()) {
            for (Instrument match : matchingInstruments) {
                if (match != null) {
                    InstrumentSpec instrumentSpec = match.getSpec();
                    System.out.println("Erin, you might like this " +
                            instrumentSpec.getBuilder() + " " + instrumentSpec.getModel() + " " +
                            instrumentSpec.getType() + " instrument:\n   " +
                            instrumentSpec.getBackWood() + " back and sides,\n   " +
                            instrumentSpec.getTopWood() + " top.\nYou can have it for only $" +
                            match.getPrice() + "!");
                }
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }



    private static void initialiseEvents(ConcertCatalogue catalogue) {

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
package com.ooad.concert;

import java.util.Date;

/**
 * Created by Aoife Sayers on 21/11/2016.
 */
public class SearchConcertTester {
    public static void main(String[] args) {

        ConcertCatalogue catalogue = new ConcertCatalogue();
        initialiseConcerts(catalogue);

        Date d = new Date();
        Concert whatErinLikes = new Concert(1234, Genre.ROCK, Venue.OLYMPIATHEATRE, d.getTime(), "Lower Than Atlantis", "3 piece alternative rock band");

        Concert concert = catalogue.search(whatErinLikes);
        if(concert != null){
            System.out.println("Erin you might like this " +
                    concert.getConcertID() + " " + concert.getAct() +
                    " \n" + concert.getActDescription() +
                    " on the " + concert.getDate() + " in the" +
                    concert.getVenue());
        }
        else
        {
            System.out.println("Sorry Erin, we have nothing for you");
        }
    }




    private static void initialiseConcerts(ConcertCatalogue catalogue){
        Date d = new Date();
        catalogue.addConcert(12345, Genre.COUNTRY, Venue.INEC, d.getTime(),"Daniel O'Donnell", "A wee thick country vegetable!" );

        catalogue.addConcert(2468, Genre.ALTERNATIVE, Venue.OLYMPIATHEATRE, d.getTime(),"Lower Than Atlantis", "An English band" );

        catalogue.addConcert(39393, Genre.REGGAE, Venue.MARLAYPARK, d.getTime(),"Bob Marley", "Jammin" );

        catalogue.addConcert(20292, Genre.INDIE, Venue.OLYMPIATHEATRE, d.getTime(),"Catfish and the Bottlemen", "Up and coming band 2016" );

        catalogue.addConcert(94823, Genre.POP, Venue.THREEARENA, d.getTime(), "Bastille", "Alternative pop band");

        catalogue.addConcert(22920, Genre.DANCE, Venue.MARLAYPARK, d.getTime(), "Disclosure", "Dance act..");

        catalogue.addConcert(394399, Genre.RNB, Venue.AVIVASTADIUM, d.getTime(), "The Weeknd", "Starboy..");

        catalogue.addConcert(23422, Genre.POP, Venue.THEMARQUEE, d.getTime(), "Ariana Grande", "Github all day... Github all night");

    }


}
    Contact GitHub API Training Shop Blog About
        © 2016 GitHub, Inc. Terms Privacy Security Status Help
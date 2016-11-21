package com.ooad.concert;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class ConcertCatalogue {
    public List<Concert> concerts;

    public ConcertCatalogue(){
        concerts = new LinkedList();

    }


    public void addConcert(int concertID, Genre genre, Venue venue, Date date, String act, String actDescription) {
            Concert concert = new Concert(concertID, genre, venue, date, act, actDescription);
            concerts.add(concert);
    }

    public Concert getConcert(int concertID) {
        for (Iterator i = concerts.iterator(); i.hasNext(); ) {
            Concert guitar = (Concert) i.next();
            if (guitar.getConcertID() == (concertID)) {
                return concert;
            }
        }
        return null;
    }


    public Concert search(Concert searchConcert) {
        for (Iterator i = concerts.iterator(); i.hasNext(); ) {
            Concert guitar = (Concert) i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            String genre = concert.getGenre();
            if ((genre != null) && (!genre.equals("")) &&
                    (!genre.equals(genre.getGenre())))
                continue;
            Venue venue = searchConcert.getVenue();
            if ((venue != null) && (!venue.equals("")) &&
                    (!venue.equals(venue.getVenue())))
                continue;
            Concert c = new Concert();


            String act = c.getAct();
            if( (act != null) && (!act.equals("")) &&
                    (!act.equals(c.getAct())) )
            {
                continue;
            }

            Date concertDate = c.getDate();
            if ((concertDate != null) && (!concertDate.equals("")) &&
                    (!concertDate.equals(c.getDate())))
                continue;
            return guitar;
        }
        return null;
    }
}
package com.ooad.concert;


import java.util.*;

public class  ConcertCatalogue {
    private List<Concert> concerts;

    public ConcertCatalogue() {
        concerts = new LinkedList();
    }


    public void addConcert(int concertID, Genre genre, Venue venue, Calendar date, String act, String actDescription) {
        Concert newConcert = new Concert(concertID, genre, venue, date, act, actDescription);
        concerts.add(newConcert);
        Concert concert = new Concert(concertID, genre, venue, date, act, actDescription);
                   concerts.add(concert);
    }

    public Concert getConcert(int concertID) {
        for (Iterator<Concert> i = concerts.iterator(); i.hasNext(); ) {
            Concert concert = (Concert) i.next();
            if (concert.getConcertID() == (concertID)) {
                return concert;
            }
        }
        return null;
    }


    public Concert search(Concert searchConcert) {
        for (Iterator<Concert> i = concerts.iterator(); i.hasNext(); ) {
            Concert concert = (Concert) i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            Genre genre = concert.getGenre();
            if ((genre != null) && (!genre.equals("")) &&
                    (!genre.equals(genre.getGenre())))
                continue;
            Venue venue = searchConcert.getVenue();
            if ((venue != null) && (!venue.equals("")) &&
                    (!venue.equals(venue.getVenue())))
                continue;
            Concert c = new Concert();


            String act = c.getAct();
            if ((act != null) && (!act.equals("")) &&
                    (!act.equals(c.getAct()))) {
                continue;
            }

            Calendar concertDate = c.getDate();
            if ((concertDate != null) && (!concertDate.equals("")) &&
                    (!concertDate.equals(c.getDate())))
                continue;
            return guitar;
        }
        return null;
    }
}
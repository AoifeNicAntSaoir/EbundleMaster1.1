package com.ooad.concert;

import java.util.Date;

public class ConcertCatalogue {
    public List<Concert> concerts;

    public ConcertCatalogue(){
        concerts = new LinkedList();

    }


    public void addConcert(int concertID, Genre genre, Venue venue, Date date, String act, String actDescription) {
        Concert newConcert = new Concert(concertID, genre, venue, date, act, actDescription);
        concerts.add(newConcert);
    }
}
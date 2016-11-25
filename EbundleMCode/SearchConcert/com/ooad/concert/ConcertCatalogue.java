package com.ooad.concert;


/**
 * Created by t00170881 on 17/11/2016.
 */
public class ConcertCataglogue {
    private List<Concert> concerts;

    public ConcertCataglogue() {
        concerts = new LinkedList();
    }


    public void addConcert(int concertID, Genre genre, Venue venue, String date, String act, String actDescription) {
        Concert newConcert = new Concert(concertID, genre, venue, date, act, actDescription);
        concerts.add(newConcert);
    }
}
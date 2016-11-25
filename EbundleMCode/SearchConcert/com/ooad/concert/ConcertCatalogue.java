package com.ooad.concert;


import java.util.Date;

/**
 * Created by t00170881 on 17/11/2016.
 */
public class ConcertCataglogue {
    private List<Concert> concerts;

    public ConcertCataglogue() {
        concerts = new LinkedList();
    }


    public void addConcert(int concertID, Genre genre, Venue venue, Date date, String act, String actDescription) {
        Concert newConcert = new Concert(concertID, genre, venue, date, act, actDescription);
        concerts.add(newConcert);
    }
}
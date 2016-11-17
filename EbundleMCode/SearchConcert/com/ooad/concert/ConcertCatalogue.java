package com.ooad.concert;

import sun.plugin2.message.Conversation;

/**
 * Created by t00170881 on 17/11/2016.
 */
public class ConcertCataglogue {
    public List concerts;

    public ConcertCataglogue() {
        concerts = new LinkedList();
    }


    public void addConcert(int concertID, String genre, String venue, String date, String act, String actDescription) {
        Concert newConcert = new Concert(concertID, genre, venue, date, act, actDescription);
        concerts.add(newConcert);
    }
}
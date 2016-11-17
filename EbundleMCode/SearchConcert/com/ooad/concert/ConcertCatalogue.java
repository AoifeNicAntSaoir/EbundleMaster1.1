package com.ooad.concert;

public class ConcertCatalogue {
    private List<Concert> concerts;

    public ConcertCatalogue(){
        concerts = new LinkedList();

    }


    public void addConcert(int concertID, Genre genre, String venue, String date, String act, String actDescription) {
        Concert newConcert = new Concert(concertID, genre, venue, date, act, actDescription);
        concerts.add(newConcert);
    }
}
package com.ooad.concert;

import java.util.Calendar;


/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert extends Event {

    private int concertID;
    private Genre genre;

    public Concert(int eventId, EventClass type,
                   Venue venue, Calendar date, double price,
                    String act, String actDescription,
                    int concertID, Genre genre) {
        super(eventId, type, venue, date, price, act, actDescription);
        this.concertID = concertID;
        this.genre = genre;
    }

    public int getConcertID() {
        return concertID;
    }

    public void setConcertID(int concertID) {
        this.concertID = concertID;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Calendar getDate() {

        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }




}
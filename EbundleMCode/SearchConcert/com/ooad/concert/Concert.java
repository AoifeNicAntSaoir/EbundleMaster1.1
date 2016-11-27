package com.ooad.concert;

import java.util.Calendar;


/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert extends Event {

    private int concertID;
    private Genre genre;
    private String act;
    private String actDescription;

    public Concert(int eventId, EventClass type,
                   Venue venue, Calendar date, double price,
                    int concertID, Genre genre, String act,
                   String actDescription) {
        super(eventId, type, venue, date, price);
        this.concertID = concertID;
        this.genre = genre;
        this.act = act;
        this.actDescription = actDescription;
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

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getActDescription() {
        return actDescription;
    }

    public void setActDescription(String actDescription) {
        this.actDescription = actDescription;
    }




}
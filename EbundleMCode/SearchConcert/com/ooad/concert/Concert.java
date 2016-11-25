package com.ooad.concert;

import java.util.Date;

/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert {

    private int concertID;
    private Genre genre;
    private Venue venue;
    private Date date;
    private String act;
    private String actDescription;

    public Concert(int concertID, Genre genre, Venue venue,
                   Date date, String act, String actDescription) {
        this.concertID = concertID;
        this.genre = genre;
        this.venue = venue;
        this.date = date;
        this.act = act;
        this.actDescription = actDescription;
    }

    public Concert(){
        this(0,null,null, null,null,null);
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
package com.ooad.concert;

/**
 * Created by Aoife Sayers on 05/12/2016.
 */
public class ConcertSpec extends EventSpec {

    protected int concertID;
    protected Genre genre;

    public ConcertSpec(String act, EventClass eventType, Venue venue, /*Calendar date*/double price, int concertID, Genre genre)
    {
        super(act,eventType,venue);
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




}

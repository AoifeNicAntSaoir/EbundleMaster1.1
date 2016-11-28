package com.ooad.concert;

/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert extends Event {

    private int concertID;
    private Genre genre;

    public Concert(EventSpec eventSpec, int eventId, double price,
                    int concertID, Genre genre){
        super(eventSpec, eventId, price);
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
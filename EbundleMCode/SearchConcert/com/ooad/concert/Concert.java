package com.ooad.concert;

import java.util.List;

/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert extends Event {

    protected int concertID;
    protected Genre genre;

    public Concert(final EventSpec eventSpec,
                   final int eventId,
                   final int concertID,
                   final Genre genre){
        super(eventSpec, eventId);
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
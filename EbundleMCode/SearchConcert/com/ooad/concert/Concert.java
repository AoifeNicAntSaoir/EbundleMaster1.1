package com.ooad.concert;

/**
 * Created by Aoife Sayers on 17/11/2016.
 */
public class Concert {

    private int concertID;
    private String genre;
    private String venue;
    private String date;
    private String act;
    private String actDescription;

    public Concert(int concertID, String genre, String venue,
                   String date, String act, String actDescription) {
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

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

    public String getVenue() {

        return venue;
    }

    public void setVenue(String venue) {

        this.venue = venue;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {

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

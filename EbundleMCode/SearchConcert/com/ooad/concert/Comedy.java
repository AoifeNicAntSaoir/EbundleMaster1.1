package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class Comedy extends Event {

    private String comedian;

    public Comedy(int eventId, EventClass type,
                  Venue venue, Calendar date, double price,
                  String act, String actDescription, String comedian){
        super(eventId, type, venue, date, price, act, actDescription);
        this.comedian = comedian;
    }

    public String getComedian(){
        return comedian;
    }

    public void setComedian(String comedian){
        this.comedian = comedian;
    }
}

package com.ooad.concert;

import java.util.Calendar;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class Comedy extends Event {

    protected String comedian;

    public Comedy(final EventSpec eventSpec,
                  final int eventId,
                  final double price,
                  final String comedian){
        super(eventSpec, eventId, price);
        this.comedian = comedian;
    }

    public String getComedian(){
        return comedian;
    }

    public void setComedian(String comedian){
        this.comedian = comedian;
    }
}

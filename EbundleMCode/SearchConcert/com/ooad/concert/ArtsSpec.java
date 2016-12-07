package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class ArtsSpec extends EventSpec {

    private ArtsType artType;

    public ArtsSpec(String act, EventClass eventType, Venue venue,
                       final int eventId,
                       final ArtsType artType){
        super(act, eventType, venue);
        this.artType = artType;
    }


    public ArtsType getArtType() {
        return artType;
    }

    public void setArtType(ArtsType artType) {
        this.artType = artType;
    }

}

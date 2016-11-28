package com.ooad.concert;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public class ArtsTheatre extends Event {
    private ArtType artType;

    public ArtsTheatre(EventSpec eventSpec, int eventId, double price,
                  ArtType artType){
        super(eventSpec, eventId, price);
        this.artType = artType;
    }


    public ArtType getArtType() {
        return artType;
    }

    public void setArtType(ArtType artType) {
        this.artType = artType;
    }



}

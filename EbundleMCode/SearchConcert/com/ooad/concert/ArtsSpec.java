package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class ArtsSpec extends EventSpec {

    private ArtsType artType;

    public ArtsSpec(final String act,
                    final EventClass eventType,
                    final Venue venue,
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

    @Override
    public boolean matches(final EventSpec anEvent) {
        if (!(anEvent instanceof ArtsSpec))
            return false;
        if (!super.matches(anEvent))
            return false;
        ArtsSpec spec = (ArtsSpec)anEvent;
        return artType == spec.artType;
    }


}

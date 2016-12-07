package com.ooad.concert;

/**
 * Created by Aoife Sayers on 06/12/2016.
 */
public class ArtsSpec extends EventSpec {

    private final ArtsType artType;

    public ArtsSpec(String act, EventClass eventType, Venue venue,
                       final int eventId,
                       final ArtsType artType){
        super(act, eventType, venue);
        this.artType = artType;
    }


    public ArtsType getArtType() {
        return artType;
    }

    @Override
    public boolean matches(final EventSpec otherSpec) {
        if (!(otherSpec instanceof ArtsSpec))
            return false;
        if (!super.matches(otherSpec))
            return false;
        ArtsSpec spec = (ArtsSpec) otherSpec;
        return artType.equals(spec.artType);
    }

}

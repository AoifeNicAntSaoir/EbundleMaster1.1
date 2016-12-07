package com.ooad.concert;

/**
 * Created by Aoife Sayers on 05/12/2016.
 */
public class ConcertSpec extends EventSpec {

    final Genre genre;

    public ConcertSpec(String act, EventClass eventType, Venue venue, Genre genre)
    {
        super(act,eventType,venue);

        this.genre = genre;
    }

    @Override
    public boolean matches(final EventSpec otherSpec) {
        if (!(otherSpec instanceof ConcertSpec))
            return false;
        if (!super.matches(otherSpec))
            return false;
        ConcertSpec spec = (ConcertSpec) otherSpec;
        return genre.equals(spec.genre);
    }





}

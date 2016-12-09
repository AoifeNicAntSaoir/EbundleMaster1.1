package com.ooad.concert;

/**
 * Created by Aoife Sayers on 05/12/2016.
 */
public class ConcertSpec extends EventSpec {

    final Genre genre;

    public ConcertSpec(final String act,
                       final EventClass eventType,
                       final Venue venue,
                       final double price,
                       final Genre genre)
    {
        super(act,eventType,venue);
        this.genre = genre;
    }


    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean matches(final EventSpec anEvent){
        if(!(anEvent instanceof ConcertSpec))
            return false;
        if (!super.matches(anEvent))
            return false;
        ConcertSpec spec = (ConcertSpec)anEvent;
        return genre == spec.genre;
    }
}

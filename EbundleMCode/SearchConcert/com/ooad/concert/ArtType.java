package com.ooad.concert;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public enum ArtType {

    BALLET, DANCE, DRAMA, MUSICALS, FILM;

    public String toString(){
        switch (this){
            case BALLET:
                return "Ballet";
            case DRAMA:
                return "Drama";
            case MUSICALS:
                return "Musicals";
            case FILM:
                return "Film";
            default:
                return "Unspecified";
        }
    }
}

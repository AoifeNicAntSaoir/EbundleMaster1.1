package com.ooad.concert;

/**
 * Created by t00170881 on 17/11/2016.
 */
public enum Genre {

    ALTERNATIVE, BLUES, CLASSICAL, COUNTRY, DANCE, INDIE, JAZZ, POP, RNB, REGGAE, ROCK;
    public String toString(){
        switch(this) {
            case ALTERNATIVE:
                return "Alternative";
            case BLUES:
                return "Blues";
            case CLASSICAL:
                return "Classical";
            case COUNTRY:
                return "Country";
            case DANCE:
                return "Dance";
            case INDIE:
                return "Indie";
            case JAZZ:
                return "Jazz";
            case POP:
                return "Pop";
            case RNB:
                return "RnB";
            case REGGAE:
                return "Reggae";
            case ROCK:
                return "Rock";
            default:
                return "Unknown Genre";
        }
    }
}
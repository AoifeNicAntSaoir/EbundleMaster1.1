package com.ooad.concert;

/**
 * Created by t00170881 on 17/11/2016.
 */
public enum Venue {
    THREEARENA, CROKEPARK, THEMARQUEE, INEC, MARLAYPARK, AVIVASTADIUM, OLYMPIATHEATRE, SIAMSATIRE,;
    public String toString(){
        switch(this){
            case THREEARENA:
                return "3Arena";
            case CROKEPARK:
                return "Croke Park";
            case THEMARQUEE:
                return "The Marquee";
            case INEC:
                return "INEC";
            case MARLAYPARK:
                return "Marlay Park";
            case AVIVASTADIUM:
                return "Aviva Stadium";
            case OLYMPIATHEATRE:
                return "Olympia Theatre";
            default:
                return "Unknown Venue";
        }
    }
}
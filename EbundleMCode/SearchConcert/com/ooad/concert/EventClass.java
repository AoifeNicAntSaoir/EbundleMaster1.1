package com.ooad.concert;
/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public enum EventClass {

    CONCERT, SPORTS, ARTSnTHEATRE, COMEDY;
    public String toString() {
        switch (this) {
            case CONCERT:
                return "Concert";
            case SPORTS:
                return "Sports";
            case ARTSnTHEATRE:
                return "Arts & Theatre";
            case COMEDY:
                return "Concert";
            default:
                return  "Unknown";
        }
    }
}

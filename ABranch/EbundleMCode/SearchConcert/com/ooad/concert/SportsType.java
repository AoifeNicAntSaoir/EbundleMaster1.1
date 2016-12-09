package com.ooad.concert;

/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public enum SportsType {

    ATHLETICS, BASKETBALL, BOXING, CRICKET, CYCLING, GAA,
    GOLF, GYMNASTICS, HOCKEY, HORSERACING, ICEHOCKEY, MARTIALARTS,
    MOTORSPORTS, RUGBY, SOCCER, TENNIS, SQUASH, WRESTLING;

    public String toString(){
        switch(this){
            case ATHLETICS:
                return "Athletics";
            case BASKETBALL:
                return "Basketball";
            case BOXING:
                return "Boxing";
            case CRICKET:
                return "Cricket";
            case CYCLING:
                return "Cycling";
            case GAA:
                return "GAA";
            case GOLF:
                return "Golf";
            case GYMNASTICS:
                return "Gymnastics";
            case HOCKEY:
                return "Hockey";
            case HORSERACING:
                return "Horse Racing";
            case ICEHOCKEY:
                return "Ice Hockey";
            case MARTIALARTS:
                return "Martial Arts";
            case MOTORSPORTS:
                return "Motor Sports";
            case RUGBY:
                return "Rugby";
            case SOCCER:
                return "Soccer";
            case TENNIS:
                return "Tennis";
            case SQUASH:
                return "Squash";
            case WRESTLING:
                return "Wrestling";
            default:
                return "Unknown";

        }
    }
}
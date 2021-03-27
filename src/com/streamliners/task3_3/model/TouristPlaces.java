package com.streamliners.task3_3.model;

import java.util.ArrayList;
import java.util.List;

public class TouristPlaces {

    String name;
    String workingHours;
    int entryTicketPrice;
    public int noOfRatings;
    public double starRating;
    List<String> famousFor;

    public TouristPlaces(String name, String workingHours, int entryTicketPrice) {
        this.name = name;
        this.workingHours = workingHours;
        this.entryTicketPrice = entryTicketPrice;
        famousFor = new ArrayList<>();
        noOfRatings = 0;
        starRating = 0;
    }

    public void rate(double stars){
        noOfRatings++;
        starRating = stars+starRating;
    }

    public double findRating(){
        return starRating/noOfRatings;
    }

    public TouristPlaces addFamousFor(String s){
        famousFor.add(s);
        return this;
    }

    boolean isPlaceOpen(){
        return true;
    }
}

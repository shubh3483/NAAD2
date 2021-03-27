package com.streamliners.task3_3.controller;

import com.streamliners.task3_3.model.City;
import com.streamliners.task3_3.model.TouristPlaces;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        TouristPlaces touristPlaces = new TouristPlaces("Amber Fort","10:00AM to 5:00PM",100);
        touristPlaces.addFamousFor("Amber Fort is known for its artistic style elements. With its large ramparts and series of gates and cobbled paths, the fort overlooks Maota Lake, which is the main source of water for the Amer Palace. Mughal architecture greatly influenced the architectural style of several buildings of the fort.");


        touristPlaces.rate(4.8);
        touristPlaces.rate(4);
        touristPlaces.rate(3.9);
        touristPlaces.rate(4.5);
        touristPlaces.rate(5);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println(df.format(touristPlaces.findRating()));

        /*City city1 = new City("Jaipur","Rajasthan");
        city1.*/
    }
}

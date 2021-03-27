package com.streamliners.task3_3.model;

import java.util.ArrayList;
import java.util.List;

public class City {

    String name;
    String state;
    List<TouristPlaces> touristPlacesList;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
        touristPlacesList = new ArrayList<>();
    }
}

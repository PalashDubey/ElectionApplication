package com.myapp.electionapp;

public class myDetails {
    private String name;
    private String capacity;
    private String facilities;
    private String coordinates;
    public myDetails(String name, String capacity, String facilities,String coordinates) {
//        this.imageText = imageText;
        this.name = name;
        this.capacity = capacity;
        this.facilities = facilities;
        this.coordinates = coordinates;
    }

//    public String getImageText() {
//        return imageText;
//    }

    public String getName() {
        return name;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getFacilities() {
        return facilities;
    }
    public String getCoordinates() {
        return coordinates;
    }

}

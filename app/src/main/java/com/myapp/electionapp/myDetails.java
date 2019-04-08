package com.myapp.electionapp;

public class myDetails {
//    private String imageText;
    private String name;
    private String capacity;
    private String facilities;

    public myDetails(String name, String capacity, String facilities) {
//        this.imageText = imageText;
        this.name = name;
        this.capacity = capacity;
        this.facilities = facilities;
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

}

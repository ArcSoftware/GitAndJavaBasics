package com.company;

/**
 * Created by Jake on 3/28/17.
 */
public class Truck {
    String type;
    int year;
    String make;
    String model;
    int millage;

    public double milesPerYear() {
        return (millage) / (2017 - year);
    }
}


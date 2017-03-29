package com.company;

/**
 * Created by Jake on 3/28/17.
 */
public class Truck {
    private String type;
    private int year;
    private String make;
    private String model;
    public static final int millage = 50;

    public double milesPerYear() {
        return (millage) / (2017 - year);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        if (!type.isEmpty()) {
            this.type = type;
            }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

        

    }




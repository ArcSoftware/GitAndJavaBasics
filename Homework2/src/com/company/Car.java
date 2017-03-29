package com.company;

/**
 * Created by Jake on 3/28/17.
 */
public class Car {
    Car(String make, String model, int year, int millage, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.millage = millage;
        this.type = type;
    }
    private String type;
    private int year;
    private String make;
    private String model;
    private int millage;
    public int averageYear() {
        return year + year /2;
        //Not sure how to call a.year and b.year. 
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
    public int getMillage() {
        return millage;
    }
    public void setMillage(int millage) {
        if (millage > 0) {
            if (millage < 100000) {
                this.millage = millage;
            }
        }
    }
}

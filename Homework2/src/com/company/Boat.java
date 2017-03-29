package com.company;

/**
 * Created by Jake on 3/28/17.
 */
public class Boat {
    Boat(String make, String model, String motorType, int year, double hours){
        setMake(make);
        setModel(model);
        this.motorType = motorType;
        this.year = year;
        this.hours = hours;
    }
    private String type;
    private int year;
    private String make;
    private String model;
    private double hours;
    private String motorType;
    private int age;

    public int modelAge() {
        return 2017 - year;
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
        if (year < 2018) {
            this.year = year;

        }
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
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getMotorType() {
        return motorType;
    }
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }
}




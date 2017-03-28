package com.company;

public class Main {

    public static void main(String[] args) {
        //This is the inventory of a used car lot.
        int currentYear = 2017;

        System.out.println("The current year is " + currentYear + ".");

        Car a = new Car();
        a.make = "Ferrari";
        a.model = "F50GT";
        a.year = 2003;
        a.millage = 3200;
        a.type = "Coupe";

        Car b = new Car();
        b.make = "Pagani";
        b.model = "Zonda R";
        b.year = 2016;
        b.millage = 499;
        b.type = "Coupe";

        Tank c = new Tank();
        c.carsBlownUp = 47;
        c.machineGun = true;
        c.mainGun = "Rail Gun";
        c.wallsDestroyed = 2;
        c.weight = 62.2;

        Boat d = new Boat();
        d.make = "Dubois";
        d.model = "SR52 Blackbird";
        d.motorType = "Triple Volvo IPS 600";
        d.year = 2010;
        d.hours = 7255.22;


        System.out.format("The age of inventory item D is %d.", d.modelAge());
        System.out.format("The damage the tank has caused ranges from $%.2f to $%.2f", c.minDamage(), c.maxDamage());
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        //This is the inventory of a used car lot.
        int currentYear = 2017;

        System.out.println("The current year is " + currentYear + ".");

        Car a = new Car("Ferrari", "F50GT", 2003, 3200, "Coupe");
        a.setMake("Ferrari");
        a.setModel("F50GT");
        a.setYear(2003);
        a.setMillage(3200);
        a.setType("Coupe");

        Car b = new Car("Pagani", "Zonda R", 2016, 499, "Coupe");
        b.setMake("Pagani");
        b.setModel("Zonda R");
        b.setYear(2016);
        b.setMillage(499);
        b.setType("Coupe");

        Tank c = new Tank(47, true, "Rail Gun", 2, 62.2);
        c.setCarsBlownUp(47);
        c.setMachineGun(true);
        c.setMainGun("Rail Gun");
        c.setWallsDestroyed(2);
        c.setWeight(62.2);

        Boat d = new Boat("Dubois", "SR52 Blackbird", "Triple Volvo IPS 600,", 2010, 7255.22);
        d.setMake("Dubois");
        d.setModel("SR52 Blackbird");
        d.setMotorType("Triple Volvo IPS 600");
        d.setYear(2010);
        d.setHours(7255.22);

        System.out.println(d.getHours());
        System.out.format("The age of inventory item D is %d. \n", d.modelAge());
        System.out.format("The damage the tank has caused ranges from $%.2f to $%.2f.", c.minDamage(), c.maxDamage());
    }
}

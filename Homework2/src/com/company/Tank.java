package com.company;

/**
 * Created by Jake on 3/28/17.
 */
public class Tank {
    int carsBlownUp;
    boolean machineGun;
    String mainGun;
    int wallsDestroyed;
    double weight;

public double maxDamage() {
    return ((carsBlownUp * 1500000)) + ((wallsDestroyed * 1700000));
}
public double minDamage() {
    return ((carsBlownUp * 2000) + (wallsDestroyed * 110000));
}
}
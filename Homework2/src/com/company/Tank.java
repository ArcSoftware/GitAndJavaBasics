package com.company;

/**
 * Created by Jake on 3/28/17.
 */
public class Tank {
    Tank(int carsBlownUp, boolean machineGun, String mainGun, int wallsDestroyed, double weight){
        this.carsBlownUp = carsBlownUp;
        this.machineGun = machineGun;
        this.mainGun = mainGun;
        this.wallsDestroyed = wallsDestroyed;
        this.weight = weight;
    }
    private int carsBlownUp;
    private boolean machineGun;
    private String mainGun;
    private int wallsDestroyed;
    private double weight;

    public int getCarsBlownUp() {
        return carsBlownUp;
    }
    public void setCarsBlownUp(int carsBlownUp) {
        this.carsBlownUp = carsBlownUp;
    }
    public boolean getMachineGun() {
        return machineGun;
    }
    public void setMachineGun(boolean machineGun) {
        this.machineGun = machineGun;
    }
    public String getMainGun() {
        return mainGun;
    }
    public void setMainGun(String mainGun) {
        this.mainGun = mainGun;
    }
    public int getWallsDestroyed() {
        return wallsDestroyed;
    }
    public void setWallsDestroyed(int wallsDestroyed) {
        this.wallsDestroyed = wallsDestroyed;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
            }
    }
    public double maxDamage() {
        return ((carsBlownUp * 1500000)) + ((wallsDestroyed * 1700000));
    }
    public double minDamage() {
        return ((carsBlownUp * 2000) + (wallsDestroyed * 110000));
    }
}
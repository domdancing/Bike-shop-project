/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author dominick valentine
 */

public class EBike extends Bike implements Serializable{
    private int batteryWatts;
    private double  batteryLife;

    public EBike(String type, int gearnum, double cost, double tiresize,int batteryWatts, double batteryLife) {
        super(type, gearnum, cost,  tiresize);
        this.batteryWatts= batteryWatts;
        this.batteryLife = batteryLife;
    }
     public int getBatteryWatts() {
        return batteryWatts;
    }

    public void setBatteryWatts(int batteryWatts) {
        this.batteryWatts = batteryWatts;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        
        return super.toString()+ " batteryWatts: " + batteryWatts + " batteryLife: " + batteryLife +" hours";
    }
    
    
    
}

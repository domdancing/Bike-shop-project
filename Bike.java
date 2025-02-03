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
public class Bike implements Serializable {
     private String type;
    private int gearnum ;
    private double cost;
  
    private double tiresize;

    public Bike(String type, int gearnum, double cost,  double tiresize) {
        this.type = type;
        this.gearnum = gearnum;
        this.cost = cost;
        
        this.tiresize = tiresize;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGearnum(int gearnum) {
        this.gearnum = gearnum;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTiresize(double tiresize) {
        this.tiresize = tiresize;
    }

    public String getType() {
        return type;
    }

    public int getGearnum() {
        return gearnum;
    }

    public double getCost() {
        return cost;
    }

   
    public double getTiresize() {
        return tiresize;
    }

    @Override
    // put the units 
    public String toString() {
        return "type is " +type + " Number of gears: " + gearnum + " cost: " + cost +"$"+" tiresize: " + tiresize +" inchs";
    }
  
}


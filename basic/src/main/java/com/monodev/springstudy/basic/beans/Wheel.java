package com.monodev.springstudy.basic.beans;

/**
 * Created by jnmcl on 2016/12/10.
 */

public class Wheel {
    public  enum WheelPosition{左前,左后,右前,右后}
    private  String brand;
    private String size;
    private WheelPosition position;

    public Wheel() {
    }

    public Wheel(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

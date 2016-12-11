package com.monodev.springstudy.basic.beans;

/**
 * Created by jnmcl on 2016/12/10.
 */
public class Engine {
    private  String brand;
    private  String cc;

    public Engine() {
    }

    public Engine(String brand, String cc) {
        this.brand = brand;
        this.cc = cc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}

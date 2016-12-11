package com.monodev.springstudy.basic.beans;

import java.util.List;

/**
 * Created by jnmcl on 2016/12/10.
 */
public class Car {

    private  Engine engine;
    private  Driver driver;
    private List<Wheel> wheels;
    public Car() {
    }

    public Car(Engine engine, List<Wheel> wheels) {
        this.engine=engine;
        this.wheels =wheels;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}

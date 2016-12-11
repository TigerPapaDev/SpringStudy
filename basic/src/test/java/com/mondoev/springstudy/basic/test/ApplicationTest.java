package com.mondoev.springstudy.basic.test;

import com.monodev.springstudy.basic.beans.Car;
import com.monodev.springstudy.basic.beans.AppConfig;
import com.monodev.springstudy.basic.beans.Engine;
import com.monodev.springstudy.basic.beans.Wheel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by jnmcl on 2016/12/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ApplicationTest {
    @Autowired
    private Wheel wheel;
    @Autowired
    private Engine  engine;
    @Autowired
    private Car car;

    @Test
    public void cdShouldNtNull(){


        wheel.setBrand("good year");
        wheel.setSize("27' ");

        engine.setBrand("BMW");
        engine.setCc("150cc");

        car.setEngine(engine);
        car.setWheel(wheel);

        assertNotNull(car);
    }
}

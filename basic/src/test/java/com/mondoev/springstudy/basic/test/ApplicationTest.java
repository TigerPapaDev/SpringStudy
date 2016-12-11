package com.mondoev.springstudy.basic.test;

import com.monodev.springstudy.basic.beans.Car;
import com.monodev.springstudy.basic.beans.AppConfig;
import com.monodev.springstudy.basic.beans.Engine;
import com.monodev.springstudy.basic.beans.Wheel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by jnmcl on 2016/12/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTest {


    public  void beanFactoryTest(){
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

    }
}

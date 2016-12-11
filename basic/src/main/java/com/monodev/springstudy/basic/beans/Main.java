package com.monodev.springstudy.basic.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jnmcl on 2016/12/11.
 */
public class Main {
    public  static void  main(String [] args) throws  Throwable{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:conf.xml");
        Car car = ctx.getBean("car",Car.class);
        System.out.println(car);
    }
}

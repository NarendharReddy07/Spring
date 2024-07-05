package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*
        setter injection
            it is nothing but assigning values to private fields of a class using
            property tag in spring.xml with value  attriburte for primitive variables and  ref attribute for objects.
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Car honda=(Car)context.getBean("carid");
        honda.displayCar();


    }
}

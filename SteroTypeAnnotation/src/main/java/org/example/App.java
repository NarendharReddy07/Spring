package org.example;

import org.example.AppConfig.AppConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ioc=new AnnotationConfigApplicationContext(AppConfigClass.class);
        Computer com=ioc.getBean(Computer.class);
        com.compute();

    }
}

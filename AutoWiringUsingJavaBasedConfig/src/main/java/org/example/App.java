package org.example;

import org.example.AppConfig.AppConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext ioc=new AnnotationConfigApplicationContext(AppConfigClass.class);
        Empolyee empObj=ioc.getBean(Empolyee.class);
        empObj.code();


    }
}

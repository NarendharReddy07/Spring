package org.example;

import org.example.AppConfig.AppConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ioc=new AnnotationConfigApplicationContext(AppConfigClass.class);
        SoftwareEmployee obj=ioc.getBean(SoftwareEmployee.class);
        obj.setExperience(10);
        obj.code();


        //calling with bean name
//        SoftwareEmployee obj1=ioc.getBean("sdeEmp",SoftwareEmployee.class);
//        obj1.code();
    }
}

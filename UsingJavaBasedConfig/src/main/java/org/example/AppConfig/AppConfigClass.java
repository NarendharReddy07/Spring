package org.example.AppConfig;

import org.example.SoftwareEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component is used to denote the below class as Container(IOC)
public class AppConfigClass {
    @Bean({"se","sdeEmp","bean_name_demo_multiple"})

    //@Bean it tells the container to include this object into  container.

    //@Bean("se")
    //giving a name for bean SoftwareEmployee as se if not by default name is methodname
    //giving multiple names as @Bean({"se","sdeEmp","bean_name_demo_multiple"})

    @Scope("prototype")//it is used to create new object when getBean() method calls
    public SoftwareEmployee softwareemployee(){
        return new SoftwareEmployee();
    }

    @Bean
    public  Laptop laptop(){
        return new Laptop();
    }
}

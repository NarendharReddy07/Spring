package org.example;

import org.example.AppConfig.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoftwareEmployee {
    private  int experience;
   // Laptop lap;
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void code(){
        System.out.println("coding with experience "+experience);
       // lap.compile();
    }


}

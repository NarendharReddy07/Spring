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
        //first do install spring dependencies in pom.xml
        //creating container
        ApplicationContext contextObj=new ClassPathXmlApplicationContext("spring.xml" );

        //in spring.xml write <bean> tag with id and associated classname
        //getting obects using getBean(id)
        printName obj= (printName) contextObj.getBean("pid");
       // printName obj=new printName();
        obj.namePrint();

    }
}

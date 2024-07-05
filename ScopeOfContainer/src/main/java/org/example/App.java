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
            Scopes for beans are:
            singleton ---->default
            prototype
            session

         */

        //creating objects in container
        //no.of objectsCreated==number of bean tags irrespective of same classes
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

      /*  Student sobj1= (Student) context.getBean("studentid1");
        sobj1.age=15;
        sobj1.studentName();

        Student sobj2= (Student) context.getBean("studentid1");
        sobj2.studentName();
        */

        /*here output is:
         student object created
        student object created
        narendhar
        age15
        narendhar
        age15

        since both sobj1,sobj2 reffering to same object gives above output
        here this is because singleton scope which is default.
        <bean id="studentid1" class="org.example.Student" scope="singleton"> </bean>

         */

        Student sobj1= (Student) context.getBean("studentid2");
        sobj1.age=15;
        sobj1.studentName();

        Student sobj2= (Student) context.getBean("studentid2");
        sobj2.studentName();

        /*here output is:
         student object created
        student object created
        narendhar
        age15
        narendhar
        age0

        since both sobj1,sobj2 reffering to same object gives above output
        here this is because of prototype scope.

        <bean id="studentid2" class="org.example.Student" scope="prototype"> </bean>
         */

    }
}

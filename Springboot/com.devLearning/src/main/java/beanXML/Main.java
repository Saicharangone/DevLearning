package beanXML;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Doctor doctor=context.getBean(Doctor.class);
        doctor.assist();
//        System.out.println(doctor.getQualification());
//        System.out.println(doctor.getSpecialization());

        Nurse nurse=context.getBean(Nurse.class);
        nurse.assist();
        System.out.println(nurse.getQualification());
        nurse.setQualification("MBBS");
        System.out.println(nurse.getQualification());

        Nurse nurse1=context.getBean(Nurse.class);
        System.out.println(nurse1.getQualification());


    }

}


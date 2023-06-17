package aopdemo;

import jdk.jfr.ContentType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(beanConfig.class);

        cart c=context.getBean(cart.class);
        c.businessLogics("Test");
        c.testReturn();


    }
}

package aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.concurrent.ExecutionException;

@Aspect
@Component
public class AspectDemo {

    @Before("execution(* aopdemo.cart.businessLogics(..))")
    public void beforeMethod(JoinPoint jp){

        System.out.println(jp.getArgs()[0].toString());

        System.out.println("Before Method");
    }

    @After("execution(* aopdemo.cart.businessLogics(..))")
    public void afterMethod(){

        System.out.println("after Method");
    }

    @Pointcut("exection(* aopdemo.cart.businessLogics(..))")
    public void after(){


    }

//    @Pointcut("exection(* aopdemo.cart.testReturn())")
//    public void returnPointcutTest(){
//
//    }
//
//    @AfterReturning(pointcut = "returnPointcutTest()", returning = "retVal")
//    public void testPointcutAfter(String retVal){
//        System.out.println("Value: "+retVal);
//
//    }



}

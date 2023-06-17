package aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspectAtentication {

    @Pointcut("within(aopdemo..*)")
    public void athentication(){

    }

    @Pointcut("within(aopdemo..*)")
    public void athorization(){

    }

    @Before("athorization() || athentication()")
    public void auth(){

        System.out.println("Before authorization");
    }

}

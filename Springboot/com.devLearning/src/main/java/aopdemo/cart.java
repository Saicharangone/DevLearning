package aopdemo;

import org.springframework.stereotype.Component;

@Component
public class cart {


    public void businessLogics(String status){

        System.out.println("Business Logic Method");

    }

    public String testReturn(){
        return "2";
    }


}

package beanXML;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "beanXML")
public class Config {

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }
}

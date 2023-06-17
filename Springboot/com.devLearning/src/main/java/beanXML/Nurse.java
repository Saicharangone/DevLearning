package beanXML;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName = "prototype")
public class Nurse {

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public void assist(){
        System.out.println("Nurse is assisting");
    }
}

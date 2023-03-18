package Pages;

import CommonMethods.CommonMethods;
import Steps.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

    @FindBy(xpath = "//span[contains(text(),'Gear')]")
    WebElement gear;
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bags;
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    CommonMethods commonMethods=new CommonMethods(Base.driver);

    public void selectBags() {
        System.out.println("&&&&&&&&&&&&&&& select_bag_under_page &&&&&&&&&&&&&&&&");
        commonMethods.ajax(gear,bags);
    }

}

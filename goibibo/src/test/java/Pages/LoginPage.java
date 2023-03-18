package Pages;

import CommonMethods.CommonMethods;
import Steps.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement login;
    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    WebElement signin;

    @FindBy(xpath = "//input[@id='email']")
            WebElement username;
    @FindBy(xpath = "//input[@name='login[password]']")
            WebElement password;


    WebDriver driver;
    CommonMethods commonMethods=new CommonMethods(Base.driver);
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void launchApplication(String link){
        driver.get(link);
    }
    public void signinToApplication(String userId,String Passkey){
        commonMethods.clickElement(login);
        System.out.println("UserName:"+userId+Passkey);
        commonMethods.sendKeys(username,userId);
        commonMethods.sendKeys(password,Passkey);
        commonMethods.clickElement(signin);

    }

    public void verifyHomePage(String title){
        commonMethods.verifyPage(title);
    }

}

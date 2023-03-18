package Pages;

import CommonMethods.CommonMethods;
import Steps.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CartPage {
    WebDriver driver;
    CommonMethods commonMethods=new CommonMethods(Base.driver);
    @FindBy(xpath="//a[@class='action showcart']")
    WebElement cart;

    @FindBy(xpath = "//button[contains(text(),'Proceed to Checkout')]")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//input[@name='company']")
    WebElement companyName;

    @FindBy(xpath = "//input[@id='M0I8K35']")
    WebElement Address;

    @FindBy(xpath = "//input[@name='city']")
    WebElement city;

    @FindBy(xpath = "//select[@name='region_id']")
    WebElement state;

    @FindBy(xpath = "//input[@name='postcode']")
    WebElement postCode;

    @FindBy(xpath = "//select[@name='country_id']")
    WebElement country;

    @FindBy(xpath = "//input[@name='telephone']")
    WebElement phone;

    @FindBy(xpath = "//tr[2]//td[@class='col col-method']//input[@type='radio']")
    WebElement radio;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement next;

    public CartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void validateOrder() {
        commonMethods.clickElement(cart);
        commonMethods.clickElement(proceedToCheckout);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public void fillCheckOutDetails(){
        commonMethods.sendKeys(companyName,"Demo Test pvt");
        commonMethods.sendKeys(Address,"1/10 xyz street");
        commonMethods.sendKeys(city,"abcd");
        commonMethods.selectByValue(state,"Colorado");
        commonMethods.sendKeys(postCode,"123456");
        commonMethods.selectByValue(country,"United States");
        commonMethods.sendKeys(phone,"12345567890");
        commonMethods.clickElement(radio);
        commonMethods.clickElement(next);




    }

}

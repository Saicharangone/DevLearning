package CommonMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class CommonMethods{
    WebDriver driver;
    @FindBy(xpath = "//span[@class='counter qty']")
    WebElement cart;

    public CommonMethods(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickElement(WebElement element){
        element.click();
    }
    public void actionClickElement(WebElement element){
        Actions action=new Actions(driver);
        action.moveToElement(element).click().build().perform();


    }
    public void actionMoveTo(WebElement element){
        Actions action=new Actions(driver);
        action.moveToElement(element).build().perform();


    }


    public void sendKeys(WebElement element, String data){
        element.sendKeys(data);
    }

    public void selectByValue(WebElement dropdown, String val){
        Select from=new Select(dropdown);
        from.selectByValue(val);

    }

    public void verifyPage(String PageTitle){

        Assert.assertEquals(driver.getTitle(),PageTitle);
    }
    public void ajax(WebElement from, WebElement to){
        Actions action=new Actions(driver);
        action.moveToElement(from).moveToElement(to).click().build().perform();

    }
    public String generateXpath(String xpathString,String number){
        String standardXpath=xpathString.replace("/$",number.toString());

        return standardXpath;
    }

}

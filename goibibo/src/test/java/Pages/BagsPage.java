package Pages;

import CommonMethods.CommonMethods;
import Steps.Base;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class BagsPage {
    WebDriver driver;
    @FindBy(xpath = "//span[@class='counter qty']")
    WebElement cart;

    @FindBy(xpath = "//a[@class='action showcart']//span[@class='counter qty'][1]")
    WebElement cartNumber;


    public BagsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    CommonMethods commonMethods=new CommonMethods(Base.driver);
    public void selectRandomBag() throws InterruptedException {
        for(int i=0;i<5;i++){
            Random random = new Random();
            int x = random.nextInt(13);
            if(x==0){
                i=i-1;
                continue;
            }
            System.out.println(x);
            String xpathNumber=String.valueOf(x);
            String xpathString=commonMethods.generateXpath("//li[@class='item product product-item'][/$]",xpathNumber);
            commonMethods.actionMoveTo(driver.findElement(By.xpath(xpathString)));
            Thread.sleep(1000);
            commonMethods.actionClickElement(driver.findElement(By.xpath(xpathString+"//span[text()='Add to Cart']")));
            WebDriverWait wait=new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']//span[@class='counter qty'][1]")));
            Thread.sleep(2000);

            //commonMethods.clickElement(cart);
        }
       }
}

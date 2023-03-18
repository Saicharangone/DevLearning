package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;
    @Before
    public void setupBrowser(){
        System.out.println("&&&&&&&&&&&Before&&&&&&&&&&&&&&&&&&&&&&");
        System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public  void closeBrowser(){
        System.out.println("&&&&&&&&&&&&&&After&&&&&&&&&&&&&&&&&&&");
        driver.close();
        driver.quit();
    }


}

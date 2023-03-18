package Steps;

import Pages.LoginPage;
import Pages.dataMapper;
import io.cucumber.java.en.Given;

public class LoginSteps {
    LoginPage loginPage=new LoginPage(Base.driver);
    dataMapper datamapper=new dataMapper();
    @Given("SignIn to the application {string}")
    public void signin_to_the_application(String string) {
            loginPage.launchApplication(string);
            System.out.println(datamapper.testData);
            loginPage.signinToApplication(datamapper.testData.get("Username"),datamapper.testData.get("Password"));
            loginPage.verifyHomePage("Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}

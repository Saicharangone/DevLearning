package Steps;

import Pages.HomePage;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage=new HomePage(Base.driver);
    String tc_id;

    @When("Select bag under gear")
    public void select_bag_under_gear() {

        System.out.println("&&&&&&&&&&&&&&& select_bag_under_gear &&&&&&&&&&&&&&&&");
        homePage.selectBags();
        // Write code here that turns the phrase above into concrete actions

    }
}

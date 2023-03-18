package Steps;

import Pages.BagsPage;
import io.cucumber.java.en.Then;

public class BagsSteps {
    BagsPage bagsPage=new BagsPage(Base.driver);
    @Then("Select products from the site")
    public void select_products_from_the_site() throws InterruptedException {

        bagsPage.selectRandomBag();
        // Write code here that turns the phrase above into concrete actions

    }
}

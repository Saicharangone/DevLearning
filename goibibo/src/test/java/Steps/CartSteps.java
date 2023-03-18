package Steps;

import Pages.CartPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;

public class CartSteps {
    CartPage cartPage=new CartPage(Base.driver);

    @Then("place order")
    public void place_order() {
        cartPage.validateOrder();
        cartPage.fillCheckOutDetails();
        // Write code here that turns the phrase above into concrete actions

    }
}

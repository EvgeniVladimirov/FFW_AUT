package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.HelpingClasses;
import selectors.BuyItemSelectors;
import selectors.HomePageSelectors;

import java.io.IOException;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition extends HelpingClasses{
	HomePageSelectors LoginElements = new HomePageSelectors(driver);
	BuyItemSelectors elements = new BuyItemSelectors(driver);
	
    @When("I enter site")
    public void i_enter_site() throws Throwable {
    	driver = ConfigDataReader.getDriverData();
    	LoginElements = new HomePageSelectors(driver);
    	elements = new BuyItemSelectors(driver);
    	driver.get("https://www.saucedemo.com/");
    }

    @Then("I login as {string} and password: {string}")
    public void i_login_as_user_and_password(String username, String password) throws Throwable {
    	LoginElements.Username().sendKeys(username);
    	LoginElements.Pasword().sendKeys(password);
    	LoginElements.LoginBtn().click();
    }

    @Then("^I see that I'm logged in$")
    public void i_see_that_im_logged_in() throws Throwable {
    	LoginElements.ShoppingCart().isDisplayed();
    }

    @Then("^I logout$")
    public void i_logout() throws Throwable {
    	LoginElements.BurgerMenu().click();
    	Thread.sleep(1000);
    	LoginElements.LogoutBtn().click();
    	LoginElements.LoginContainer().isDisplayed();
    	ConfigDataReader.ClosingDriver(driver);
    }
	
	@Then("I add item to cart")
	public void add_item_to_cart() throws InterruptedException, IOException {
    	elements = new BuyItemSelectors(driver);
		Thread.sleep(1000);
		elements.addToCart().click();
		elements.shoppingCartNum().isDisplayed(); //To see if Item is added to cart
	}
	
	@Then("I go to cart")
	public void go_to_cart() {
		elements.shoppingCart().click();
		if(!elements.itemName().getText().equals("Sauce Labs Backpack")) {
			System.out.println("Wrong Item Selected");
		}
	}
	
	@Then("I checkout")
	public void i_checkout() {
		elements.checkOutBtn().click();
		elements.firstName().sendKeys("Test");
		elements.lastName().sendKeys("T3st");
		elements.postalCode().sendKeys("1111");
		elements.continueBtn().click();
		elements.finishBtn().click();
		elements.completeText().isDisplayed(); //To check if order is complete
	}
}
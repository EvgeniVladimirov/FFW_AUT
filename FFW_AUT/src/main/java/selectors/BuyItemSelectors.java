package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyItemSelectors {
	WebDriver driver;
	public BuyItemSelectors(WebDriver driver) {
		this.driver = driver;
	}
	
	By addBagToCart_SELECTOR = By.cssSelector("#add-to-cart-sauce-labs-backpack");
	By shoppingCartNum_SELECTOR = By.cssSelector(".shopping_cart_badge");
	By shoppingCart_SELECTOR = By.cssSelector(".shopping_cart_link");
	By itemName_SELECTOR = By.cssSelector(".inventory_item_name");
	By checkoutBtn_SELECTOR = By.cssSelector("#checkout");
	By firstName_SELECTOR = By.cssSelector("#first-name");
	By lastName_SELECTOR = By.cssSelector("#last-name");
	By postalCode_SELECTOR = By.cssSelector("#postal-code");
	By continueBtn_SELECTOR = By.cssSelector("#continue");
	By finishBtn_SELECTOR = By.cssSelector("#finish");
	By completeText_SELECTOR = By.cssSelector(".complete-header");


	public WebElement addToCart() {
		return driver.findElement(addBagToCart_SELECTOR);
	}
	

	public WebElement shoppingCartNum() {
		return driver.findElement(shoppingCartNum_SELECTOR);
	}

	public WebElement shoppingCart() {
		return driver.findElement(shoppingCart_SELECTOR);
	}

	public WebElement itemName() {
		return driver.findElement(itemName_SELECTOR);
	}

	public WebElement checkOutBtn() {
		return driver.findElement(checkoutBtn_SELECTOR);
	}

	public WebElement firstName() {
		return driver.findElement(firstName_SELECTOR);
	}

	public WebElement lastName() {
		return driver.findElement(lastName_SELECTOR);
	}
	
	public WebElement postalCode() {
		return driver.findElement(postalCode_SELECTOR);
	}

	public WebElement continueBtn() {
		return driver.findElement(continueBtn_SELECTOR);
	}
	
	public WebElement finishBtn() {
		return driver.findElement(finishBtn_SELECTOR);
	}
	
	public WebElement completeText() {
		return driver.findElement(completeText_SELECTOR);
	}

}

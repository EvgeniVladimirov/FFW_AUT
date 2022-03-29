package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSelectors{
	
	WebDriver driver;
	public HomePageSelectors(WebDriver driver) {
		this.driver = driver;
	}
	
	By username_SELECTOR = By.cssSelector("#user-name.input_error");
	By password_SELECTOR = By.cssSelector("#password");
	By loginBtn_SELECTOR = By.cssSelector("#login-button");
	By shoppingCart_SELECTOR = By.cssSelector("#shopping_cart_container");
	By burgerMenu_SELECTOR = By.cssSelector("#react-burger-menu-btn");
	By logout_SELECTOR = By.cssSelector("#logout_sidebar_link");
	By loginContainer_SELECTOR = By.cssSelector("#login_button_container");

	public WebElement Username() {
		return driver.findElement(username_SELECTOR);
	}
	
	public WebElement Pasword() {
		return driver.findElement(password_SELECTOR);
	}
	
	public WebElement LoginBtn() {
		return driver.findElement(loginBtn_SELECTOR);
	}
	
	public WebElement ShoppingCart() {
		return driver.findElement(shoppingCart_SELECTOR);
	}
	
	public WebElement BurgerMenu() {
		return driver.findElement(burgerMenu_SELECTOR);
	}
	
	public WebElement LogoutBtn() {
		return driver.findElement(logout_SELECTOR);
	}
	
	public WebElement LoginContainer() {
		return driver.findElement(loginContainer_SELECTOR);
	}

}

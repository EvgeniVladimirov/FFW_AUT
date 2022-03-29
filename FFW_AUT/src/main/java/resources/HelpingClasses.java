package resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelpingClasses {
	public WebDriver driver;
	
	public static class ConfigDataReader {

		private Properties properties;
		private String propertyFilePath = ".\\src\\main\\java\\resources\\Configuration.properties";
		
		private static ConfigDataReader config;

		public void ConfigFileReader() {
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(propertyFilePath));
				properties = new Properties();
				try {
					properties.load(reader);
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("browser_config not found at " + propertyFilePath);
			}
		}

		public String getBrowser() {
			ConfigFileReader();
			String browser = properties.getProperty("browser");
			if (browser.equals("Chrome"))
				return browser;
			else
				throw new RuntimeException("Browser not specified in the config_browser file.");
		}

		public static WebDriver getDriverData() throws IOException {
			config = new ConfigDataReader();
			WebDriver driver;
			if (config.getBrowser().equals("Chrome"))
				driver = Chrome();
			else if (config.getBrowser().equals("Firefox"))
				driver = Firefox();
			else
				throw new RuntimeException("Something's fishy");
			driver.manage().window().maximize();
			return driver;
		}

		public static WebDriver Chrome() {
			System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
		}

		public static WebDriver Firefox() {
			System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			return driver;
		}
		
		public static void ClosingDriver(WebDriver driver) {
			driver.close();
			driver.quit();
		}
	}
}

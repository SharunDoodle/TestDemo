package common;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	
	
	static String OSName;
	static String UserDir;
	public static String ResourcePath;
	static String linuxResourcePath;

	private static WebDriver driver;
	public static Properties prop;
	


	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver Driver) {
		BaseUtil.driver = Driver;
	}
	
	public static void main(String[] args) throws IOException {
		launchDriver();
	}
	
	
	public static void launchDriver() throws IOException {
		OSName = System.getProperty("os.name");
		System.out.println("My OSName = " +  OSName);
		
		UserDir = System.getProperty("user.dir");
		System.out.println("My UserDir = " +  UserDir);
		
		ResourcePath = UserDir + "\\src\\main\\resources"; 
		linuxResourcePath = UserDir + "//src//main//resources";
		
		String ChromeDriver =  ResourcePath + "\\Drivers\\Windows\\chromedriver.exe";
		
		
		
			System.out.println("Chrome case is executing");
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", ChromeDriver);
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("https://kmpuat.ckdigital.in/");
			driver.manage().window().maximize();
			setDriver(driver);
			}

	
	public static void closeMethod() {
		driver.quit();	
	}

	}

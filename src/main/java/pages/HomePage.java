package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import common.BaseUtil;

public class HomePage {
	WebDriver driver= BaseUtil.getDriver();
	

	

	public void verifyLandingPage() throws InterruptedException {
		WebElement Logo = driver.findElement(By.xpath("//img[@alt='Transportation logistics – Hitek Logistic']"));
		Logo.isDisplayed();
		String title = driver.getTitle();
		System.out.println("The title is = "  +title);
	}




	public void clickHomeMenu() {
		WebElement HomeBtn = driver.findElement(By.xpath("//a[.='Home']"));
		HomeBtn.isDisplayed();
		HomeBtn.click();
		System.out.println("Home page clicked successfully");
		
	}




	public void viewGetmoreButton() throws InterruptedException {
		WebElement GetMore = driver.findElement(By.xpath("//a[.='Get more']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", GetMore);
		Thread.sleep(1000); 
		GetMore.isDisplayed();	
		System.out.println("Get more viewed successfully");
	}




	public void clickGetmoreButton() throws InterruptedException {
		WebElement GetMore = driver.findElement(By.xpath("//a[.='Get more']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", GetMore);
		Thread.sleep(1000); 
		GetMore.click();	
		System.out.println("Get more clicked successfully");
		
	}




	public void verifyFollowUsIsDisplayed() throws InterruptedException {
		WebElement FollowUsFooter = driver.findElement(By.xpath("//div[@class='footer_slide']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FollowUsFooter);
		Thread.sleep(1000); 
		Boolean result =  FollowUsFooter.isDisplayed();
		
		Assert.assertTrue(result);
		System.out.println("Follow us footer viewed successfully");
	}




	
	
	
	
	

}

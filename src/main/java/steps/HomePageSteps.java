package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import common.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	WebDriver driver = BaseUtil.getDriver();
	HomePage hp;
	
	@Given("User launch the application")
	public void user_launch_the_application() throws IOException {
	    BaseUtil.launchDriver();
	    hp= new HomePage();
	    
	    
	}

	@Given("verify user navigate to the landing page")
	public void verify_user_navigate_to_the_landing_page() throws InterruptedException {
		
	    hp.verifyLandingPage();
	}

	@When("user clicks on the home menu")
	public void user_clicks_on_the_home_menu() {
		hp.clickHomeMenu();
	}

	@When("user should able to view get more button")
	public void user_should_able_to_view_get_more_button() throws InterruptedException {
	   hp.viewGetmoreButton();
	}

	@When("user clicks get more button")
	public void user_clicks_get_more_button() throws InterruptedException {
	  hp.clickGetmoreButton();
	}

	@Then("verify follow us footer is displayed")
	public void verify_follow_us_footer_is_displayed() throws InterruptedException {
	   hp.verifyFollowUsIsDisplayed();
	}

	@Then("user close the application")
	public void user_close_the_application() {
	   BaseUtil.closeMethod();
	}
}

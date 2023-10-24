package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonBaseHooksSteps {
	

	@Given("I am on the Amazon Home Page") 



	public void i_am_on_the_amazon_home_page() { 



	// Write code here that turns the phrase above into concrete actions 



		System.out.println("Yes,I am on the main page"); 



	} 

	@Then("I click on sigin button") 



	public void i_click_on_sigin_button() throws InterruptedException { 



	// Write code here that turns the phrase above into concrete actions\ 



		AmazonBaseHooks.driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();  

		Thread.sleep(1000);  



	} 

	@Then("I enter the emaiilid as {string}") 



	public void i_enter_the_emaiilid_as(String EmailId) { 



	// Write code here that turns

		AmazonBaseHooks.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EmailId); 



	} 

	@Then("I click on continue button") 



	public void i_click_on_continue_button() throws InterruptedException { 



	// Write code here that turns the phrase above into concrete actions 



		AmazonBaseHooks.driver.findElement(By.xpath("//input[@class='a-button-input']")).click(); 



		Thread.sleep(1000); 	  



	}  



	@Then("I capture the error message") 



	public void i_capture_the_error_message() { 



	// Write code here that turns the phrase above into concrete actions 



		String text=AmazonBaseHooks.driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();  



	 

	 



		System.out.println("Error message form the page" + text);  



	} 



	@Then("I Click on mobile option")

	public void i_click_on_mobile_option() throws InterruptedException {

	    // Write code here that turns the phrase above into concrete actions

		AmazonBaseHooks.driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));



		

	} 



}

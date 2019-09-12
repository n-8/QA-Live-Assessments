package Cucumber.Java.TestTheZooJavaNumber8;

import java.net.MalformedURLException;

import Pages.BasePage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.And;


public class CommonSteps {

   BasePage basePage = new BasePage();
   
   public CommonSteps() {
	   
	   basePage = new BasePage();
   }
   
   @Given("^The user opens a Browser and navigates to the Zoo app root URL$") 
   public void goToZooSite() throws MalformedURLException{
		
	   basePage.openBrowser();
	   
   }
	
   @And("^The user closes the browser session$") 
   public void closeBrowserSession() {   

	   basePage.closeBrowser();
	   
   }
	
	
	
}

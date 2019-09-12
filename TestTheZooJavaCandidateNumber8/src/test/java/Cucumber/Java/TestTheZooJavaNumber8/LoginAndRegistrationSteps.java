package Cucumber.Java.TestTheZooJavaNumber8;

import java.util.List;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en.And;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import Pages.WelcomePage;
import Pages.RegisterPage;
import Pages.LoginPage;
import Pages.StorePage;

public class LoginAndRegistrationSteps	 { 
  
   WelcomePage welcomePage;
   RegisterPage registerPage;
   LoginPage loginPage;
   StorePage storePage;
	
   public LoginAndRegistrationSteps() {
	   welcomePage = new WelcomePage();
	   registerPage = new RegisterPage();
	   loginPage = new LoginPage();
	   storePage = new StorePage();
   }
	
   @Then("^Validate that the Welcome Page loads correctly$") 
   public void validateTextsandLinksFromTheWelcomeMenu() {   
	   
	   List<String> textsList = welcomePage.getTextsFromTheWelcomeMenu();
	   
	   assertTrue("list doesn't contain 'Show animals'", textsList.contains("Show animals"));
	   assertTrue("list doesn't contain 'Show keepers'", textsList.contains("Show keepers"));
	   assertTrue("list doesn't contain 'Contact Us'", textsList.contains("Contact us"));
	   
	   List<String> linksList = welcomePage.getLinksFromTheWelcomeMenu();
	   assertTrue("list doesn't contain link '/animals'", linksList.contains("https://qa.number8.com/animals"));
	   assertTrue("list doesn't contain link '/keepers'", linksList.contains("https://qa.number8.com/keepers"));
	   assertTrue("list doesn't contain link '/contact'", linksList.contains("https://qa.number8.com/contact"));
	   	   
   }

   @And("^The user clicks on the top right menu Register button$")
   public void clickOnTheTopRightRegisterButton() {
   	
   		welcomePage.clickOnTheTopRightMenuRegisterButton();
   }	


   @Given("^The user enters the required registration data \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and clicks the Register button$")
   public void fillOutTheRegisterFormAndSubmitIt(String name, String surname, String email, String password, String passwordConfirmation) throws InterruptedException {
	   
		registerPage.fillOutAnSubmitRegistrationFrom(name, surname, email, password, passwordConfirmation);
   }
   

   @And("^The user clicks on the top right menu Login button$")
   public void clickOnTheTopRightLoginButton() {
   	
   		loginPage.clickOnTheTopRightMenuLoginButton();
   }	
   
   
   @Given("^The user enters the required login data \"([^\"]*)\" and \"([^\"]*)\" in the Login form and clicks the Login button$")
   public void fillOutLoginFormAndSubmitIt(String email, String password) throws InterruptedException {
	   
	   loginPage.fillOutTheLoginFormAndSubmitIt(email, password);
   }   
   
   @Then("^The user validates that the \"([^\"]*)\" from the top right menu Nav Bar drop down link is her or his first name$")
   public void validateUserNameFromTopRightMenNavBarDropdownLink (String expectedName) throws InterruptedException {

	   String actualName = welcomePage.getUserFirstNameFromTopRightNavBarDropdownMenuTitleLink();
	   
	   assertEquals("Name for top right menu nav bar dropdown link doesn't match expected", expectedName, actualName);
   }   
   
   
   @When("^The user navigates to the Store page from the NavBar$")
   public void clickOnStoreNavbarLink() {
	   storePage.clickOnStoresNavBarLink();
   }
   
   	
   
} 
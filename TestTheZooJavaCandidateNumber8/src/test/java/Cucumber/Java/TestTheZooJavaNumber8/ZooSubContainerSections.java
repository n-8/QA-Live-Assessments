package Cucumber.Java.TestTheZooJavaNumber8;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en.Given;

import static org.junit.Assert.assertEquals;
import Pages.AnimalsPage;
import Pages.StorePage;

public class ZooSubContainerSections { 
  
   AnimalsPage animalsPage;
   StorePage storePage;
   
   
   public ZooSubContainerSections(){
	   
	   animalsPage = new AnimalsPage();
	   storePage = new StorePage();
   }
	
   @When("^The user clicks on Animals option of the Navigaion Bar$") 
   public void clickOnAnimalsSubContainerSectionHeaderText() {   
			
	   animalsPage.clickOnAnimalsNavBarLink();
   }
   
   @Then("^The Animal Sub Page must load and show Animals in the Header$") 
   public void validateTextAnimalsSubContainerSectionHeaderText() throws InterruptedException {   
	   
	   assertEquals("The Animals Sub Section doesn't contain the correct header text", "Animals", animalsPage.getAnimalsSectionHeaderText());
	   
   }
   	
   
   @Given("^The user sends constant string 'ABC' to an input box that shows a button after a delay$")
   public void sendRandomKeyToTextBoxThatShowsAButtonWithDelay() throws InterruptedException {   
	   
	   storePage.sendKeyToDelayedTextBoxAndReturnWhenButtonAppears();
	   
   }
   	
   
} 
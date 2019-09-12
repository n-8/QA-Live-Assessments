package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AnimalsPage extends BasePage {
	
	
	By.ByXPath byAnimalsNavBarLink = new By.ByXPath("//li/a[@href='/animals']");
	By.ByXPath byAnimalsPageTitle = new By.ByXPath("//animals/div/h1");
	
	public AnimalsPage() {
	
	}

	public void clickOnAnimalsNavBarLink() {
		
	    WebElement animalsNavBarLink = driver.findElement(byAnimalsNavBarLink);
	    animalsNavBarLink.click();
		
	}
	
	
	public String getAnimalsSectionHeaderText() {     
		
	    WebElement animalsPageTitle = driver.findElement(byAnimalsPageTitle);
	    return animalsPageTitle.getText();
	   
	}
	
}

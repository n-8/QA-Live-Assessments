package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class StorePage extends BasePage {
	
	
	By.ByCssSelector byStoreNavBarLink = new By.ByCssSelector("ul.navbar-nav > li > a[href='/store']");
	By.ByXPath byDelayedTextBox = new By.ByXPath("//app-root/div[2]/tienda/div[1]/div[4]/input[1]");
	By.ByCssSelector byDelayedButton = new By.ByCssSelector("parque button");
	
	int interval = 0;
	int timeElapsed = 0;
	
	public StorePage() {
	
	}

	public void sendKeyToDelayedTextBoxAndReturnWhenButtonAppears() {
		

	}
	
	public void clickOnStoresNavBarLink() {
		
	    WebElement storeNavBarLink = driver.findElement(byStoreNavBarLink);
	    storeNavBarLink.click();
		
	}
	

}



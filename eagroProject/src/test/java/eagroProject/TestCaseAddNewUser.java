package eagroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.testng.annotations.Test;

public class TestCaseAddNewUser {
	WebDriver driver = new FirefoxDriver();


	@Test (priority = 0)
	public void homepage(){
		
//		driver.get("http://118.67.220.50/unifiedeagro/auth/login");
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/");
				
		//provide login credentials
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("Yatomi04");
		
		//Click on login button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
		
		System.out.println("method homepage");
	
	}	
	
	
	@Test (priority = 1)
	public void createUser(){
		try{
		
		//MOve to user list page
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/user/list");
		//Click on create button
		driver.findElement(By.className("create")).click();
		
		System.out.println("method createuser");
		
		
	//==========================Scroll Starts=========//
		//Scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//scroll the main web page till end.		
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	//page scroll
			Thread.sleep(3000);


			WebElement elementForm = driver.findElement(By.id("frmCreate"));	//form scroll

			Coordinates cor=((Locatable)elementForm).getCoordinates();
			cor.inViewPort();
			
			Thread.sleep(3000);
			
		///Scroll done/Finished

		
		
		//method call for saveButton from AllButtonAction.java class
			AllButtonAction.saveButton(driver);
			driver.findElement(By.id("address1")).sendKeys("Address1, Dhaka Bangladesh");
			Thread.sleep(3000);
			AllButtonAction.resetButton(driver);
			
			AllButtonAction.savenCloseButton(driver);			
			AllButtonAction.closeButton(driver);
			
	}	catch (Exception e){
		e.printStackTrace();
	}
	}
}

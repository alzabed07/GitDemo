package eagroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class EagroLogin {
	
	@Test
	public void homepage(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/auth/login/");
		String title= driver.getTitle();
		System.out.println("title is=+title");
//		driver.findElement(By.id("uh-search-box")).sendKeys("bangladesh");
//		driver.findElement(By.id("uh-search-button")).click();
//        driver.findElement(By.id("uh-signin")).click();
//		driver.close(); 
		
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.name("password")).sendKeys("Yatomi04");
//		driver.findElement(By.xpath("//*[@id="frmUserLogin"]/div/div[4]/button")).click();
	}
}

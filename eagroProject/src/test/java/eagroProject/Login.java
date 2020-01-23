package eagroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public void homepage(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/auth/login/");
		String title= driver.getTitle();
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.name("password")).sendKeys("Yatomi04");
}

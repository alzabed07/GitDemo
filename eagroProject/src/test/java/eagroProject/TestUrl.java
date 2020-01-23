package eagroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestUrl {
	@Test 
	public void homepage(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/auth/login/");
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.name("password")).sendKeys("Yatomi04");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
		driver.get("http://agroportal.grameen-intel.com/unifiedeagro/user/list");
		driver.findElement(By.className("create")).click();
		
		
	}
}

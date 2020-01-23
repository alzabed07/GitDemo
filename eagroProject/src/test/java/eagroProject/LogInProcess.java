package eagroProject;

import org.openqa.selenium.By;

static void LoginProcess (WebDriver driverx){
	
	try{
//	WebDriver driver = new ChromeDriver();
	driverx.get("http://agroportal.grameen-intel.com/unifiedeagro/");
	driverx.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
	driverx.findElement(By.name("password")).sendKeys("Yatomi04");
	driverx.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
	
	}catch (Exception e){
		e.
	}

}

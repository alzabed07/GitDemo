package eagroProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddnewCustomer {
	
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void loginProcess(){
		try{
			LoginNew.loginProcess(Driverx);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	
	
}




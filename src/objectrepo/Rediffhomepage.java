package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rediffhomepage {
	

	WebDriver driver;
	
	public Rediffhomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.id("query");
	By click=By.xpath("//input[type='submit']");
			

}

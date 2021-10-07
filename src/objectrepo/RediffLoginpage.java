package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {


	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
    By username=By.xpath(".//*[@id=\'txtlogin\']");
    By password=By.name("num");
    By login=By.cssSelector("#pass_div > input:nth-child(10)");
    By home=By.linkText("Forgot password?");
    
    
    public WebElement Emailid()
    {
		return driver.findElement(username);
    	
    }
    
    public WebElement password()
    {
		return driver.findElement(password);
    	
    }
    
    public WebElement submit()
    {
		return driver.findElement(login);
    	
    }
    
    
}

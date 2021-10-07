package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectrepo.RediffLoginpage;

public class Loginapplication {
	
	@Test 
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","A:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		RediffLoginpage r1=new RediffLoginpage(driver);
		
		r1.Emailid().sendKeys("hello");
		r1.password().sendKeys("password");
		r1.submit().click();
	}

}

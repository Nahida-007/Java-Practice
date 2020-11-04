package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicSeleniumCoding {

	public static void main(String[] args) { 
	    String currDir = System.getProperty("user.dir");
	    
		System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		// first commit

	}

}


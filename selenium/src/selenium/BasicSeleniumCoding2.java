package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumCoding2 {
	
	WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		String currDir = System.getProperty("user.dir");
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(); 
		}
		
		else if(browser.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.get(url);
		
	}

	public static void main(String args[]) {
		
		BasicSeleniumCoding2 obj = new BasicSeleniumCoding2();
		obj.setupBrowser("firefox","https://www.facebook.com");
		
        
	}

}

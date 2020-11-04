package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators1 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName' and  @size='20']"));
		FirstName.sendKeys("Nahida");
		WebElement LastName = driver.findElement(By.xpath("//input[@maxlength='60' and @name='lastName']"));
		LastName.sendKeys("Parveen");
		Thread.sleep(1000);
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("+9959978740");
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("nahida.parveen00007@gmail.com");
		WebElement address = driver.findElement(By.xpath("//*[@name='address1'][@size='40'][@maxlength='60']"));
		address.sendKeys("GreenLand Garden, Near Lotus Pond");
		WebElement city = driver.findElement(By.xpath("//*[contains(@name,'city')]"));
		city.sendKeys("Hyderabad");
		WebElement state = driver.findElement(By.xpath("//input[contains(@name,'state')]"));
		state.sendKeys("Telangana");
		WebElement postalCode = driver.findElement(By.xpath("//input[starts-with(@name,'po')]"));
		postalCode.sendKeys("500081");
		WebElement countryDropDown = driver.findElement(By.xpath("//select[starts-with(@name,'cou')]"));
		Select country = new Select(countryDropDown);
		country.selectByVisibleText("ARUBA");
		Thread.sleep(2000);
		country.selectByValue("ANTARCTICA");
		Thread.sleep(2000);
        country.selectByIndex(3);
        WebElement userName = driver.findElement(By.cssSelector("input#email"));
        userName.sendKeys("Nahida_07");
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("Nahida_07");
		WebElement confirmPassword = driver.findElement(By.cssSelector("input[name='confirmPassword']"));
		confirmPassword.sendKeys("Nahida_07");
		WebElement submit = driver.findElement(By.cssSelector("input[name='submit']"));
		submit.click();
		
		//driver.quit();
		

	}

}

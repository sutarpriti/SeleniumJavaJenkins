package testing_operation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Ex12_HandleTextBox {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	@Test
	public void test01() throws InterruptedException {
	driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	WebElement usernameTextbox = driver.findElement(By.name("username"));
	if (usernameTextbox.isDisplayed() == true && usernameTextbox.isEnabled() == true) {
	usernameTextbox.sendKeys("john");
	Thread.sleep(2000);
	usernameTextbox.clear();
	Thread.sleep(2000);
	} 
	else {
	System.out.println("Textbox is not working");
	}
	driver.quit();
}
}

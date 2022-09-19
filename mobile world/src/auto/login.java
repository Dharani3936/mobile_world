package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		pom login=new pom(driver);
		login.goTo();
		login.loginpage("bhavadharani", "q1w2e3");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		pom login1=new pom(driver1);
		login1.goTo();
		login1.loginpage("", "");
	}

}

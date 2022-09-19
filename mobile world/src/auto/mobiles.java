package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mobiles {

	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		pom all=new pom(driver);
		all.goTo();
		all.mobiles("samsung");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		pom all1=new pom(driver1);
		all1.goTo();
		all1.mobiles("samsung 20 pixel with dual camera ");
	}

}

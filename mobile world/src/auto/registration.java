package auto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registration {

	@Test
	public void setup()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		pom signin=new pom(driver);
		signin.goTo();
		signin.registration("Bhava","Dharani", "bhava123@gmail.com", "q1w2e3", 
				"05/27/2000", "9898989898", "My hobbies are playing games");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		pom signin1=new pom(driver1);		
		signin1.goTo();
		signin1.registration("Bh","P", "BHAVA@gmail.com", "q1w2e31Q2W3E4R5T6Y7U8I77UYT65RT", 
				"", "9898989898989898", "My hobbies are playing games");
		
		
		
		
		
		
		
		
		
	}

}

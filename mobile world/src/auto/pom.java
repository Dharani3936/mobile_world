package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {

	WebDriver driver;
	
	public pom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//get url
		/*public void goTo()
		{
			driver.get("https://mobileworld.banyanpro.com/");
		}*/
	
	//signin
	@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
	WebElement signin;
	
	
	//signup
	@FindBy(linkText="Sign up")
	WebElement signup;
	
	
	
	//register form
	@FindBy(id="myName")
	WebElement firstname;
	
	@FindBy(css="input[placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(css="input[type='date']")
	WebElement dob;
	
	@FindBy(xpath="//form/div[3]/div[4]")
	WebElement gender;
	
	@FindBy(css="input[type='number']")
	WebElement mobilenumber;
	
	@FindBy(css="textarea.form-control")
	WebElement shortbio;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement register;
	
	@FindBy(xpath="//form/div[6]/div[3]")
	WebElement signin1;
	
	
	//login form
	@FindBy(css="input[type='text']")
	WebElement user;
			
	@FindBy(css="input[type='password']")
	WebElement lpassword;
			
	@FindBy(xpath="//a[@type='submit']")
	WebElement login;
	
	//all mobiles
	@FindBy(linkText="All Mobiles")
	WebElement clickmobile;
	
	@FindBy(css="input#myInput")
	WebElement searchbox;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[5]/a")
	WebElement clickorder;
	
	
	//get url
	public void goTo()
			{
				driver.get("https://mobileworld.banyanpro.com/");
			}
	
	

	public void registration(String fname,String lname,String Email,
	String paswrd,String dateofbirth,String phoneno,String bio)
		{
			signin.click();
			signup.click();
			firstname.sendKeys(fname);
			lastname.sendKeys(lname);
			email.sendKeys(Email);
			password.sendKeys(paswrd);
			dob.sendKeys(dateofbirth);
			gender.click();
			mobilenumber.sendKeys(phoneno);
			shortbio.sendKeys(bio);
			register.click();
			driver.switchTo().alert().accept();
			signin1.click();
		}
		
				
		public void loginpage(String uname,String pword)
		{
			signin.click();
			user.sendKeys(uname);
			lpassword.sendKeys(pword);
			login.click();
			
		}
		
		public void mobiles(String box)
		{
			clickmobile.click();
			searchbox.sendKeys(box);
			clickorder.click();
		}

	
	

	
	
	
}

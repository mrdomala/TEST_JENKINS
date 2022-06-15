package art.cucumber.io.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_uspwd_en {
	
	WebDriver project_Driver;
	
	@FindBy(xpath="//*[ contains(text(),'Login')]")
	WebElement Login;
	
	@FindBy(xpath="//a[@id='register-btn']")
	WebElement Login_frame;
	
	@FindBy(xpath="//*[@formcontrolname='userName']")
	WebElement Username;
	
	@FindBy(xpath="//*[@formcontrolname='password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@class=\"btn btn-primary\"]")
	WebElement Login_button;
	
	@FindBy(xpath="//input[1]")
	WebElement OTP_0;
	
	@FindBy(xpath="//input[2]")
	WebElement OTP_1;
	
	@FindBy(xpath="//input[3]")
	WebElement OTP_2;
	
	@FindBy(xpath="//input[4]")
	WebElement OTP_3;
	
	@FindBy(xpath="//*[@id='Submit-btn']")
	WebElement Submit;
	
	public login_uspwd_en(WebDriver project_Driver) {
		this.project_Driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}

	public void ClickonLogin() throws InterruptedException {
		Thread.sleep(3000);
		Login.click();
	}
	public void ClickonLogin_frame() throws InterruptedException {
		Thread.sleep(2000);
		Login_frame.click();
	}
	public void Enter_Username(String username) throws InterruptedException {
		Thread.sleep(3000);
		Username.sendKeys(username);
	}
	public void Enter_Password(String password) throws InterruptedException {
		Thread.sleep(3000);
		Password.sendKeys(password);
	}
	public void Login_button() throws InterruptedException {
		Thread.sleep(3000);
		Login_button.sendKeys(Keys.ENTER);
	}
	public void Enter_otp_0(String otp_0) throws InterruptedException {
		Thread.sleep(8000);
		OTP_0.sendKeys(otp_0);
	}
	public void Enter_otp_1(String otp_1) throws InterruptedException {
		Thread.sleep(3000);
		OTP_1.sendKeys(otp_1);
	}
	public void Enter_otp_2(String otp_2) throws InterruptedException {
		Thread.sleep(3000);
		OTP_2.sendKeys(otp_2);
	}
	public void Enter_otp_3(String otp_3) throws InterruptedException {
		Thread.sleep(3000);
		OTP_3.sendKeys(otp_3);
	}
	public void Submit() throws InterruptedException {
		Thread.sleep(3000);
		Submit.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
	}

	public void getText() {
		// TODO Auto-generated method stub
		
	}
}

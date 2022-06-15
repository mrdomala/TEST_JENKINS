package art.cucumber.io.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_nidmb_ar {
	WebDriver project_Driver;
	@FindBy(xpath = "//a[contains(text(),'عربي')]")
	WebElement Arabic_Text;

	@FindBy(xpath = "//*[@id=\'navbar1\']/ul[3]/li[2]/a")
	WebElement Login;

	@FindBy(xpath = "//a[contains(text(),' تسجيل دخول')]")
	WebElement Login_frame;

	@FindBy(xpath = "//a[@id=' pills-profile-tab']")
	WebElement NationalId_MobileNo;

	@FindBy(xpath = "//*[@formcontrolname='nationalId']")
	WebElement nationalId;

	@FindBy(xpath = "//*[@formcontrolname='mobile']")
	WebElement mobile;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/app-login-options[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
	WebElement login_button;

	@FindBy(xpath = "//input[1]")
	WebElement OTP_0;

	@FindBy(xpath = "//input[2]")
	WebElement OTP_1;

	@FindBy(xpath = "//input[3]")
	WebElement OTP_2;

	@FindBy(xpath = "//input[4]")
	WebElement OTP_3;

	@FindBy(xpath = "//*[@id='Submit-btn']")
	WebElement Submit;

	public login_nidmb_ar(WebDriver project_Driver) {
		this.project_Driver = project_Driver;
		PageFactory.initElements(project_Driver, this);

	}
	public void ClickonArabic() throws InterruptedException {
		Arabic_Text.click();
		Thread.sleep(5000);
	}
	public void ClickonLogin() throws InterruptedException {
		Thread.sleep(3000);
		Login.click();
	}

	public void ClickonLogin_frame() throws InterruptedException {
		Thread.sleep(5000);
		Login_frame.click();
	}

	public void ClickonNID_MN() throws InterruptedException {
		Thread.sleep(5000);
		NationalId_MobileNo.sendKeys(Keys.ENTER);
	}

	public void Enter_NationalId(String nationalid) throws InterruptedException {
		Thread.sleep(1000);
		nationalId.sendKeys(nationalid);
	}

	public void Enter_MobileNo(String mobileno) throws InterruptedException {
		Thread.sleep(3000);
		mobile.sendKeys(mobileno);
		Thread.sleep(10000);
	}

	public void Login_button() throws InterruptedException {
		Thread.sleep(3000);
		login_button.sendKeys(Keys.ENTER);
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
}

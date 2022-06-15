package art.cucumber.io.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import art.cucumber.io.pages.login_uspwd_en;
import art.cucumber.io.reusableComponent.WebDriverHelper;
import art.cucumber.io.runner.CucumberRunner;
import art.cucumber.io.utility.ReadPropertyFile;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public abstract class login_uspwd_en_details {
	protected Scenario scenario;
    @Before
    public void background(Scenario scenario) {
        this.scenario = scenario;
    }
	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());


	login_uspwd_en loginuspwd;

	
	@Given("Browser is open")
	public void browser_is_open() throws Exception{
	    String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
		driver.manage().window().maximize();
		log.info("Browser opened sucessfully");
	}
	@When("User in home page")
	public void user_in_home_page() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("User in home page");

	}

	@Then("User click on the login option")
	public void user_click_on_the_login_option() throws Exception {
		loginuspwd = new login_uspwd_en(driver);
		loginuspwd.ClickonLogin();
		log.info("Clicked on login!");
	}

	@Then("User click on the login on already registered")
	public void user_click_on_the_login_on_already_registered() throws Exception {
		loginuspwd.ClickonLogin_frame();
		log.info("Clicked on login inside the frame!");
	}

	@Then("User enter username as {string}")
	public void user_enter_username_as(String username) throws Exception {
		loginuspwd.Enter_Username(username);
		log.info("User entered the username as" + " " + username);
	}

	@Then("User enter password as {string}")
	public void user_enter_password_as(String password) throws Exception {
		loginuspwd.Enter_Password(password);
		log.info("User entered the password as" + " " + password);
	}

	@Then("Click on Login")
	public void click_on_login() throws Exception {
	   loginuspwd.Login_button();
	}
	
	@Then("User enter OTP_0 as {string}")
	public void user_enter_otp0_as(String otp_0) throws Exception {
		log.info("in loop OTP_0");
	    loginuspwd.Enter_otp_0(otp_0);
	    log.info("User entered the static otp_0 text block as : 1");
	}
	
	@Then("User enter OTP_1 as {string}")
	public void user_enter_otp1_as(String otp_1) throws Exception {
	    loginuspwd.Enter_otp_1(otp_1);
	    log.info("User entered the static otp_1 text block as : 1");
	}
	
	@Then("User enter OTP_2 as {string}")
	public void user_enter_otp2_as(String otp_2) throws Exception {
	    loginuspwd.Enter_otp_2(otp_2);
	    log.info("User entered the static otp_2 text block as : 1");
	}
	
	@Then("User enter OTP_3 as {string}")
	public void user_enter_otp3_as(String otp_3) throws Exception {
	    loginuspwd.Enter_otp_3(otp_3);
	    log.info("User entered the static otp_3 text block as : 1");
	}

	@Then("Click on Submit")
	public void click_on_submit()throws Exception {
	    loginuspwd.Submit();
	    log.info("Waiting for logged in user profile screen!");
	    Thread.sleep(10000);
	    log.info("Successfully logged in!");
	    
	}
	
	@When("^report get generated$")
	public void report_get_generated() throws Throwable {
		report.flush();
		log.info("Report gets generated");
	
	}
	
	public static ExtentReports getExtentReportInstance() {
		// TODO Auto-generated method stub
		return report;
	}
	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	
}

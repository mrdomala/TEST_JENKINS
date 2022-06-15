package art.cucumber.io.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import art.cucumber.io.pages.login_nidmb_ar;
import art.cucumber.io.reusableComponent.WebDriverHelper;
import art.cucumber.io.runner.CucumberRunner;
import art.cucumber.io.utility.ReadPropertyFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_nidmb_ar_details {
	static WebDriver driver;
	ReadPropertyFile rp = null;
	static ExtentReports report = new ExtentReports(".//report//ExtentReport.html");
	Logger log = LogManager.getLogger(CucumberRunner.class.getName());


	login_nidmb_ar loginnidmb;
	
	@Given("Browser open")
	public void browser_open() throws Exception {
//		driver = login_uspwd_en_details.getDriver();
//		driver.manage().window().maximize();
//		log.info("Getting driver from the previous page");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		WebDriverHelper.initializeDriver();
		driver = WebDriverHelper.getDriver();
		driver.manage().window().maximize();
		log.info("Browser opened sucessfully");
	}

	@When("User is in home page")
	public void user_is_in_home_page() throws Exception {
		rp = new ReadPropertyFile();
		driver.get(rp.getUrl());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("User in home page");
	}
	@And("user click on the Arabic language hyperlink")
	public void user_clicks_on_the_Arabic_language_hyperlink() throws Exception {
		loginnidmb = new login_nidmb_ar(driver);
		loginnidmb.ClickonArabic();
		log.info("User navigated to arabic version!");
	}

	@Then("User clicks on login option")
	public void user_clicks_on_login_option() throws Exception {
		loginnidmb.ClickonLogin();
		log.info("Clicked on login!");
	}

	@Then("User clicks on login already registered")
	public void user_clicks_on_login_already_registered() throws Exception {
		loginnidmb.ClickonLogin_frame();
		log.info("Clicked on login inside the frame!");
	}
	@Then("Clicks on NationalID & MobileNumber")
	public void clicks_on_National_ID_Mobile_Number() throws Exception {
		loginnidmb.ClickonNID_MN();
		log.info("User moved to National Id and Mobile Number login!");
	}

	@Then("User enters nationalid as {string}")
	public void user_enters_national_id_as(String nationalid) throws Exception {
	   loginnidmb.Enter_NationalId(nationalid);
	   log.info("User entered the username as" + " " + nationalid);
	}

	@Then("User enters mobileno as {string}")
	public void user_enters_mobile_no_as(String mobileno) throws Exception {
		loginnidmb.Enter_MobileNo(mobileno);
		log.info("User entered the username as" + " " + mobileno);
	}


	@And("Click in login")
	public void Click_in_login() throws Exception {
		log.info("yet to click login!");
		loginnidmb.Login_button();
		log.info("Clicked login!");
	}
	
	@Then("User enter oTP_0 as {string}")
	public void user_enter_oTP0_as(String otp_0) throws Exception {
		log.info("in loop OTP_0");
		loginnidmb.Enter_otp_0(otp_0);
	    log.info("User entered the static otp_0 text block as : 1");
	}
	
	@Then("User enter oTP_1 as {string}")
	public void user_enter_oTP1_as(String otp_1) throws Exception {
		loginnidmb.Enter_otp_1(otp_1);
	    log.info("User entered the static otp_1 text block as : 1");
	}
	
	@Then("User enter oTP_2 as {string}")
	public void user_enter_oTP2_as(String otp_2) throws Exception {
		loginnidmb.Enter_otp_2(otp_2);
	    log.info("User entered the static otp_2 text block as : 1");
	}
	
	@Then("User enter oTP_3 as {string}")
	public void user_enter_oTP3_as(String otp_3) throws Exception {
		loginnidmb.Enter_otp_3(otp_3);
	    log.info("User entered the static otp_3 text block as : 1");
	}

	@Then("Clickss on submit")
	public void clickss_on_submit()throws Exception {
		loginnidmb.Submit();
	    log.info("Waiting for logged in user profile screen!");
	    Thread.sleep(10000);
	    log.info("Successfully logged in!");
	   
	}
	
//	@When("^report get generated$")
//	public void report_get_generated() throws Throwable {
//		report.flush();
//		log.info("Report gets generated");
//	
//	}
	
	public static ExtentReports getExtentReportInstance() {
		// TODO Auto-generated method stub
		return report;
	}
	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
}

package com.qa.stepDefenition;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.treetable.TreeTableModelAdapter;

public class HomePageSteps extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	@Given("^user is opens browser$")
	public void user_is_opens_browser() throws Throwable {
		TestBase.initiization();

	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user logs in to app$")
	public void user_enters_username_and_password() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);

	}

//	@Then("^validate logged in username$")
//	public void validate_logged_in_username() throws Throwable {
//		testUtil = new TestUtil();
//		testUtil.switchToFrame();
//		Thread.sleep(3000);
//		boolean homeCurrectUsername = homePage.verifyCorrectUserName();
//		Assert.assertEquals("Murodjon Azimov", homeCurrectUsername);
//	}

}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Murodjon Azimov')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksList;

	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	WebElement companiesLink;

	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement calendarLink;

	@FindBy(xpath = "//a[contains(text(),'Cases')]")
	WebElement casesLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();

	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();

	}

	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
	}

}

package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webelements.Checkbox;

public class HomePage extends PageObject{
	
	
@Managed
WebDriver driver;
	@FindBy(name = "firstname")
	WebElementFacade firstNameInputField;
	
	@FindBy(xpath = "//input[@value='Manual Tester']")
	WebElementFacade manualTesterChkbox;
	
	@FindBy(xpath = "//input[@value='Automation Tester']")
	WebElementFacade automationTesterChkbox;
	
	@FindBy(name = "continents")
	WebElementFacade continentsDropdown;
	
	@FindBy(id = "selenium_commands")
	WebElementFacade dropdownDropdown;
	
	@FindBy(id = "photo")
	WebElementFacade photoUpload;
	
	
	@FindBy(xpath = "//div[@class='overflowable-contents']/div/ul/li//a[contains(text(),'Interviews')]")
	WebElementFacade interviewsLabel;
	
	@FindBy(xpath = "//button[text()='Start']")
	WebElementFacade startButton;
	
	@FindBy(xpath = "//button[text()='Enable']")
	WebElementFacade enableButton;
	
	Checkbox manualTestChkbox = new Checkbox(manualTesterChkbox);
	
	Checkbox autoTesterChkbox = new Checkbox(automationTesterChkbox);
	
	@FindBy(xpath = "//input[@type='text']")
	WebElementFacade textBox1;
	
	@FindBy(xpath = "//button[text()='Disable']")
	WebElementFacade disableButton;
	
	@FindBy(xpath = "//button[text()='Alert Box']")
	WebElementFacade alertBoxButton;
	
	@FindBy(xpath = "//button[text()='Confirm Alert Box']")
	WebElementFacade confirmAlertBoxButton;
	
	@FindBy(xpath = "//button[text()='Prompt Alert Box']")
	WebElementFacade promptAlertBoxButton;
	

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	public void enterTextInFirstName(String txt) {
		interviewsLabel.shouldBeVisible();
		System.out.println("Present:"+interviewsLabel.isPresent());
		System.out.println("Visible:"+interviewsLabel.isVisible());
		evaluateJavascript("arguments[0].scrollIntoView(true);",interviewsLabel);
		System.out.println("Has Focus:"+	firstNameInputField.hasFocus());
		firstNameInputField.click();
		System.out.println("Has Focus:"+	firstNameInputField.hasFocus());
		withAction().moveToElement(interviewsLabel).build().perform();
		System.out.println();
		
	}
	
	public void validateDynamicELements() {
		//http://the-internet.herokuapp.com/dynamic_controls
		System.out.println("Is Enabled:"+textBox1.isEnabled());
		enableButton.click();
		waitForTextToAppear("It's enabled!");
//		System.out.println("Is Enabled:"+textBox1.isEnabled());
		textBox1.sendKeys("Test");
		waitABit(10000);
		disableButton.click();
		waitForTextToAppear("It's disabled!");
		
	}
	
	public void validateAlertHandling() {
		//https://nxtgenaiacademy.com/alertandpopup/
		alertBoxButton.click();
		System.out.println("Alert Text:"+getAlert().getText());
		getAlert().accept();
		confirmAlertBoxButton.click();
		System.out.println("Alert Text:"+getAlert().getText());
		getAlert().dismiss();
		promptAlertBoxButton.click();
		getAlert().sendKeys("Test");
		getAlert().accept();
		
	}
	
}

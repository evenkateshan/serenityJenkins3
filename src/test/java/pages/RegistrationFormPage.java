package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.fhcdi.com")
public class RegistrationFormPage extends PageObject{
	
	//https://nxtgenaiacademy.com/demo-site/
	public  static final String EXPECTED_TRANS_ID_LABEL = "The Transaction ID";
	
	@FindBy(id = "vfb-5")
	WebElementFacade firstNameInputField;
	
	@FindBy(id = "vfb-7")
	WebElementFacade lastNameInputField;
	
	@FindBy(id = "vfb-14")
	WebElementFacade emailInputField;
	
	@FindBy(id = "vfb-8-1")
	WebElementFacade maleRadioButton;
	
	@FindBy(id = "vfb-8-2")
	WebElementFacade femaleRadioButton;
	
	@FindBy(id = "vfb-3")
	WebElementFacade verificationNumberInputField;
	
	@FindBy(id = "vfb-4")
	WebElementFacade submitButton;
	
	@FindBy(className = "elementor-shortcode")
	WebElementFacade successMsgLabel;
	
	@FindBy(name = "username")
	WebElementFacade userName;
	
	@FindBy(name = "password")
	WebElementFacade password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElementFacade loginBtn;
	
	@FindBy(xpath = "//label[text()='Employment Status']/parent::div/parent::div/div[2]//i")
	WebElementFacade employeeDropDownBtn;
	
	@FindBy(xpath = "//div[@role='listbox']")
	WebElementFacade dropdown;
	
	@FindBy(xpath = "//span[text()='Freelance']/parent::div")
	WebElementFacade freelanceOption;
	
	@FindBy(xpath = "//*[@class='_2KpZ6l _2doB4z']")
	WebElementFacade closeBtn;
	
	@FindBy(xpath = "//*[@class='_3704LK']")
	WebElementFacade inputField;
	
	@FindBy(xpath = "//*[@class='L0Z3Pu']")
	WebElementFacade searchBtn;
	
	public RegistrationFormPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterFirstName(String firstName) {
		firstNameInputField.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		lastNameInputField.sendKeys(lastName);
	}
	
	public void clickMaleRadioButton() {
		maleRadioButton.click();
	}
	
	public void clickFemaleRadioButton() {
		femaleRadioButton.click();
	}
	
	public void enterEmail(String email) {
		emailInputField.sendKeys(email);
	}
	
	public void enterVerificationNumber(int verificationNum) {
		verificationNumberInputField.sendKeys(String.valueOf(verificationNum));
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public String getSuccessMessge() {
		return successMsgLabel.getText();
	}
	
	public void handleDropdown()
	{
		closeBtn.click();
		inputField.sendKeys("Nike");
		searchBtn.click();
		waitForTextToAppear("Showing");
		String mainWinHandle = getDriver().getWindowHandle();
		Set<String> winhandles = getDriver().getWindowHandles();
		findBy("//a[contains(text(),'Nike Sports')]").click();
		for(String winHandle: winhandles) {
			if(!winHandle.equalsIgnoreCase(mainWinHandle))
				getDriver().switchTo().window(winHandle);
		}
//		userName.sendKeys("admin");
//		password.sendKeys("admin123");
//		loginBtn.click();
//		waitForTextToAppear("Employee List");
//		employeeDropDownBtn.click();
//		waitForTextToAppear("Freelance");
//		freelanceOption.click();
		System.out.println("Done1");
//		
		
	}
}

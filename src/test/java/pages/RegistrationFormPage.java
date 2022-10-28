package pages;

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
}

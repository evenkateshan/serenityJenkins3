package helpers;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import pages.RegistrationFormPage;

public class RegistrationHelper {
	
	
	RegistrationFormPage registrationFormPage;
	
	@Step
	public void openDemoWebsite() {
		EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
	    String url2 = variables.getProperty("webdriver.base.url2");
	    System.out.println(url2);
		registrationFormPage.open();
		registrationFormPage.getDriver().manage().window().maximize();
		registrationFormPage.handleDropdown();
	}
	
	@Step
	public void enterFirstNameAndLastName(String firstName, String lastName) {
		registrationFormPage.enterFirstName(firstName);
		registrationFormPage.enterLastName(lastName);
	}
	
	@Step
	public void selectGender(String gender) throws Exception {
		if(gender.equalsIgnoreCase("Male"))
			registrationFormPage.clickMaleRadioButton();
		else if(gender.equalsIgnoreCase("Female"))
			registrationFormPage.clickFemaleRadioButton();
		else
			throw new Exception("Invalid input for gender");
	}
	
	@Step
	public void enterEmail(String email) {
		registrationFormPage.enterEmail(email);
	}
	
	@Step
	public void enterVerificationNumber(int verificationNum) {
		registrationFormPage.enterVerificationNumber(verificationNum);
	}

	@Step
	public void submitRegistrationForm() {
		registrationFormPage.clickSubmit();
	}
	
	@Step
	public void validateSuccessfulRegistration(String expectedMessage) {
		registrationFormPage.waitForTextToAppear("The Transaction ID");
		assert(registrationFormPage.getSuccessMessge()).contains(expectedMessage);
	}
}

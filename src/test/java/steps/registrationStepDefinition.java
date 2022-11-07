package steps;


import helpers.RegistrationHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;


public class registrationStepDefinition {
	
	

	@Steps(shared =true) 
	RegistrationHelper registrationHelper;
	
	@Given("user opens demo website") 
	public void userOpensDemoWebsite() {
		registrationHelper.openDemoWebsite();
	}
	
	@And("user enters {string} in first name and {string} in last name fields in registration form") 
	public void userEnterFirstNameAndLastNameInRegistrationForm(String firstName, String lastName) {
		registrationHelper.enterFirstNameAndLastName(firstName, lastName);
	}
	
	@And("user selects {string} in Gender section in registration form")
	public void userSelectsGenderInGenderSectionInRegistrationForm(String gender) throws Exception {
		registrationHelper.selectGender(gender);
	}
	
	@And("user enters {string} in email field in registration form")
	public void userEntersEmailInEmailFieldInRegistrationForm(String email) {
		registrationHelper.enterEmail(email);
	}
	
	@And("user enters {int} in verification section in registration form")
	public void userEntersRandomNumberInVerificationSectionInRegistrationForm(int randomVerificationNum) {
		registrationHelper.enterVerificationNumber(randomVerificationNum);
	}
	
	@And("user clicks on submit button in registration form")
	public void userClicksOnSubmitButtonInRegistrationForm() {
		registrationHelper.submitRegistrationForm();
	}
	
	@And("registration should be successful and {string} message should be displayed")
	public void registrationShouldBeSuccessfulAndExpectedMessageShouldBeDisplayed(String expectedMessage) {
		registrationHelper.validateSuccessfulRegistration(expectedMessage);
	}
	
	
}

package helpers;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class SerenityWebTestHelper {

	HomePage homePage;
	@Step
	public void validateBuiltInMethods()
	{
		homePage.open();
		homePage.getDriver().manage().window().maximize();
		homePage.validateDynamicELements();
		System.out.println("Done");
	}
}

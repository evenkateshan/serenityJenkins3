package steps;

import java.util.List;
import java.util.Map;

import helpers.SerenityWebTestHelper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class serenityWebTestStepDefintion {
    
	@Steps(shared =true)
	SerenityWebTestHelper serenityWebTestHelper;
	
	@Given("Open website and enter text in any field")
	public void openWebSiteAndEnterTextInAnyField() {
		serenityWebTestHelper.validateBuiltInMethods();
	}
	
	@Given("read and print this string {string}")
	public void readAndPrintThisString(String sampleString) {
		System.out.println("Sample String:" +sampleString);
	}
	
	@Given("read and print this int {int}")
	public void readAndPrintThisInteger(int sampleInteger) {
		System.out.println("Sample Int:" +sampleInteger);
	}
	
	@Given("read and print below list")
	public void readAndPrintBelowList(List<String> list) {
		System.out.println("Sample List:" +list);
	}
	
	@Given("read and print below map")
	public void readAndPrintBelowMap(Map<String, String> map) {
		System.out.println("Sample Map:"+map);
		System.out.println("Key Value:"+map.get("Key3"));
	}
	
	@Given("read and print below data table")
	public void readAndPrintBelowMap(DataTable dataTable) {
		List<Map<String, String>> dataList = dataTable.asMaps();
		for(Map<String, String> map: dataList) {
			System.out.println("Printing DataTable: "+map);
		}
	}
	
	@Given("print sample strings using examples - Charactor {string} and color {string}")
	public void printSampleStringsUsingExamples(String character, String color) {
			System.out.println("Character: "+character+" Color:"+color);
	}
	
	@Given("print sample strings using examples - Charactor Bubbles and color blue")
	public void printSampleStringsUsingExamplesWithCharacterBubblesAndColorBlue() {
			System.out.println("Character: Bubbles and color blue by default");
	}
}

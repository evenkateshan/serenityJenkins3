Feature: Validate Built-in Methods of serenity

  @Test1
  Scenario: Validate built-in methods of serenity
    Given Open website and enter text in any field
    
    @Test3
    Scenario: Cucumber test data
    Given read and print this string "Sample String"
    And read and print this int 3
    And read and print below list
    	|	Field1	|
    	|	Field2	|
    	|	Field3	|
    	|	Field4	|
    And read and print below map
    	|	Key			|		Value			|
    	|	Key1		|		Value1		|
    	|	Key2		|		Value2		|
    	|	Key3		|		Value3		|
    And read and print below data table
    	|	UserName	|		Password		|	Comments	|
    	|	Admin			|		admin123		| admin			|
    	|	Bubbles		|		bubbles123	| blue			|
    	|	Buttercup	|		buttercup123| green			|
    	|	blossom		|		blossom123	| red				|
    	
    @Test6
    Scenario Outline: Cucumber test data3
    Given print sample strings using examples - Charactor <Character> and color <Color> 
    Examples:
    |	Character	|	Color			|
    |	Bubbles		| blue			|
    |	Buttercup	| green			|
    |	blossom		| red				|
    
    	
 @Test9
  Scenario: Register a profile in demo website
  	Given user opens demo website
    And user enters "First" in first name and "Last" in last name fields in registration form
    And user selects "Male" in Gender section in registration form
    And user enters "demoemail@gmail.com" in email field in registration form
    And user enters 99 in verification section in registration form
    When user clicks on submit button in registration form
    Then registration should be successful and "Registration Form is Successfully Submitteddhes8ry834e" message should be displayed
    
    
    
    
    
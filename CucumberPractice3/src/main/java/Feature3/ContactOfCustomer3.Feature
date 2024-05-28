Feature: Contact us function
Going to verify the contact us page of the application
Background:
Given I navigate to the protrainingtech.com
    When I click on Contact Us link
    Then The Contact Us form displays
    @Adhoc
  Scenario Outline:
Verify if user click the submit button without entering required fields it shows validation error
    
    When I click on register button
    Then I am able to see the validation error
    When I enter the name "<Name>"
    Then I will see the "<ids>"
    Examples:
    |Name   |ids |
    |Rizwan | 90 |
    |Shabaz | 80 |
    |Asim    | 70|
    @Function
  Scenario Outline:
Verify if user click the submit button without entering required fields it shows validation error
    
    When I click on register button
    Then I am able to see the validation error
    When I enter the name "<Name>"
    Then I will see the "<ids>"
    Examples:
    |Name   |ids |
    |Rizwan | 90 |
    |Shabaz | 80 |
    |Asim    | 70|
 
    
    

  
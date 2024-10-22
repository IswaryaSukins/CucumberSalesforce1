Feature: Login Salesforce Application

Scenario Outline: Login to positive data

Given Launch browser and load the url and maximize the screen
And Enter the username as 'dilip@testleaf.com'
And Enter the password as 'leaf@2024'
When Click on Loginbutton
And Click toggle
And Click ViewAll
And Click Sales
And Click Opportunities
And Click New
When Enter name as <OpportunityName>
When Enter amount as <Amount>
Then Close the date as today
And Click Stage select NeedAnalysis
And save the changes
And Extract the Text
Then Verify all

 Examples:
 |OpportunityName|Amount|
 |'Salesforce Automation by Iswarya'|'75000'|


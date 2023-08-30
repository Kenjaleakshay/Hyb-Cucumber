@login @all
Feature: Login Fuctionality

Background:
Given User navigates to login page
@smoke @validcredentials
Scenario Outline: User should login with valid credentials
When user enters valid emailid <email>
And User enters valid password <password>
And click on login button 
Then User should be logged in
Examples:
|email                     | password  |
|akshayrckenjale@gmail.com |akakakak   | 
|nikheelbellale@gmail.com  |akakakak   |
|mayurbhalerao@gmail.com   |akakak     | 
 
 @smoke @invalidcredentials
Scenario: User should not be login with invalid credentials
When enters invalid emailid "skskskkssk"
And enters invalid password "kdkkdkd"
And click on login button
Then user should not be logged in
And should get proper warning 

Scenario: User should not be login without entering credentials
When user doesnot enter any emailid
And doesnot enter any password
And click on login button
Then should get proper warning
# But user should not login






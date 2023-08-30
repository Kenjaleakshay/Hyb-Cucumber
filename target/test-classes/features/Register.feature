@register @all
Feature: Register Functionality
@sanity
Scenario: User should be able to register with entering all mandatory fields
Given User navigates to register page
When user enters the below info fields
|firstname      |Akshay|
|lastname       |Kenjale|
|email          |kakakka@gmail.com|
|telephone      |929292929|
|password       |akaowi|
|passwordconfirm|alaoa|
And click on continue button
Then User account should be created


Feature: Learn only

Scenario Outline: User Learning
Given user goes to page
When user enters email <var>
And user enters pw1<var2>
And user enters valid "aks"
And user enters invalid "ken"
Then user learns
Examples:
|var        |var2      |
|Mango      |Lion      |
|Apple      |Tiger     |
|Banana     |Zebra     |   
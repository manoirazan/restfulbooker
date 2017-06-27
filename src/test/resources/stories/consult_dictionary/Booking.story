Scenario: Create an Entry
Given I have logged into Hotel Management page
When I click create a single Entry
Then I verify single entry data

Scenario: Create multiple Entries
Given I have logged into Hotel Management page
When I click create multiple Entry
Then I have multiple data entered

Scenario: Delete an Entry
Given I have logged into Hotel Management page
When I click to delete an existing hotel
Then the hotel is removed from the list
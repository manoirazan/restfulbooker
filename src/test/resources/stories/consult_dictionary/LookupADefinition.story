Scenario: Create an Entry
Given I have logged into Hotel Management page
When I click create a single Entry
Then I verify single entry data

Scenario: Delete an Entry
Meta:
@ignore
Given the user is on the Wikionary home page
When I click create multiple Entry
Then I verify single entry data


Scenario: Create multiple an Entries
Meta:
@ignore
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'pear'

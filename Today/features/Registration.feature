Feature: Registration Functionality

Scenario: User trying to register using invalid credentials

Given User is on Registration page
When User enter invalid input
Then Invalid input message must be displayed

Scenario: User trying to register using valid credentials

Given User is on Registration page
When User enters correct details
Then personal details are validated message should be displayed
@account
Feature:
  As a customer
  I want to be able to Sign In
  So that I can use restricted features of the application

  Scenario: Sign In
    Given I have navigated to the Sign In page
    And I enter valid credentials
    Then I am successfully signed in

  Scenario: Invalid Sign In
    Given I have navigated to the Sign In page
    And I enter invalid credentials
    Then I am successfully signed in

  Scenario: Sign In (Imperative)
    Given I have navigated to the Sign In page
    And I enter the username bob
    And I enter the password 1234
    And I click the submit button
    Then I am successfully signed in

  Scenario Outline: Sign in with different accounts
    Given I have navigated to the Sign In page
    And I log in with <username> and <password>
    Then I have successfully signed in
    Examples:
    | username | password |
    | Bob      | 1234     |
    | Betty    | abcd     |

  Scenario: Sign in with incorrect password (alternate)
    Given the following accounts have been created
    | username | password |
    | sally    | !@#!@#   |
    | anna     | foobar   |
    | jakob    | pa$$word |
    And I have navigated to the Sign In page
    And I log in with sally and !!!!
    Then I should get an incorrect password page





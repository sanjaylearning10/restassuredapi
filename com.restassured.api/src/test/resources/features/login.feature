Feature: User Login
  As a user of the application
  I want to be able to log in
  So that I can access my personalized content

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter my username "testuser" and password "password123"
    And I click the "Login" button
    Then I should be redirected to the dashboard
    And I should see a welcome message "Welcome, testuser!"

  Scenario: Unsuccessful login with invalid password
    Given I am on the login page
    When I enter my username "testuser" and password "wrongpassword"
    And I click the "Login" button
    Then I should see an error message "Invalid credentials. Please try again."
    And I should remain on the login page

  Scenario Outline: Login with various valid and invalid credentials
    Given I am on the login page
    When I login with email "<email>" and password "<password>"
    Then I should see the message "<message>"

    Examples: 
      | email               | password   | message             |
      | valid@example.com   | Pass1234   | Login successful    |
      | invalid@example.com | wrongpass  | Invalid credentials |
      | another@example.com | correctpwd | Login successful    |

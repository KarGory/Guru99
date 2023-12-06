Feature: Home Page Test

  Background:
    Given Browser is open
    Given I am on the main site


  Scenario Outline: Login in with login and password


    When Fill name input with "<login>"
    When Fill password input with  "<password>"
   When Click cookie confirmation
    When Wait for login button
    When Click login button
    Then Wait for the welcome inscription

    Examples:
      | login                          | password  |
      | mngr540589                     | jybeqed     |





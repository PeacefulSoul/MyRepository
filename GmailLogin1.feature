Feature: To test gmail login functionality once again

  @Gmaillogin1
  Scenario: To again login to gmail.com
    Given Open application Url
    When Enter Username "seleniumgeeks"
    And Click Next
    And Enter Password "selenium1234"
    And click Signin
    Then Verify user logged in

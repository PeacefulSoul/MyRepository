Feature: To test gmail login functionality third time

  @Gmaillogin2
  Scenario: To login to gmail.com again over
    Given Open application Url
    When Enter Username
      | Username      |
      | seleniumgeeks |
    And Click Next
    And Enter Password
      | Password     |
      | selenium1234 |
    And click Signin
    Then Verify user logged in

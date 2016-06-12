Feature: To test gmail login functionality

  @Gmaillogin
  Scenario Outline: To login to gmail.com
    Given Open application Url
    When Enter Username <username>
    And Click Next
    And Enter Password <password>
    And click Signin
    Then Verify user logged in

    Examples: 
      | username      | password     |
      | seleniumgeeks | selenium1234 |

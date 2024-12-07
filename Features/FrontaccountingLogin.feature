Feature: Login

  Scenario: Verify login on frontaccounting page.
    Given Open browser And open frontaccounting
    When Clear data of username and password.
    And Enter username and password data in username and password field
    Then verify the title after login
    And verify that sales Quotation Entry is available.

Feature: Login Account Validation
  Scenario Outline: Verify Login Account functionality
    Given User Launch Browser
    When Enter URL
    And User click on signin Link
    And User Enter email in your email as "<emailAddress>"
    And user enter password as "<password>"
    And user click on Sign in 
    And user enter product name  in search as "<productName>"
   Then user should see username on the top left corner in HomePage as"<AccountName>"

    Examples: 
      | emailAddress                     | password        | productName |  AccountName      |
      | sushma9328@gmail.com             | sushmareddy     | kurti       |   Hi, Sushma      |

@all
Feature: Test the Amazon page on chrome Browser

  @Sigin
  Scenario Outline: Test the sigin with Email-id
    Given I am on the Amazon Home Page
    Then I click on sigin button
    Then I enter the emaiilid as '<EmailId>'
    Then I click on continue button
    Then I capture the error message

    Examples: 
      | EmailId                |
      | seleniumdemo@gmail.com |

  Scenario: Test the mobile page
    Given I am on the Amazon Home Page
    Then I Click on mobile option

Feature: Booking the tickets
  Background: Setup driver
  Scenario Outline: Magento order
    Given initiate testDate
    Given SignIn to the application "https://magento.softwaretestingboard.com/"
    When Select bag under gear
    Then Select products from the site
    Then place order

    Examples:
      |TestCaseID|
      |HYD|

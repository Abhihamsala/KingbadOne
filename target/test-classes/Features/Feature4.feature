Feature: Title for google serach box
 
  Scenario : Verify title google page
    Given open "chrome" browser
    When enter "Abdul Kalam" in search box
    And hit ENTRY Key
    Then Page title should contains "Abdul Kalam"

Feature: Title google search 

  Scenario : verify Title page
    Given open "chrome" browser
    When enter "trump" in serach box
    And hit enter key
    Then page title should contains "trump"
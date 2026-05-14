Feature: Title ttd 

  Scenario Outline: verify Title of your ttd page
    Given open browser
    When enter "trump" in serach box
    Then 
    When I should see "<word>" page title
    And I hit ENTRY Key
    Then I should see "<word>" in the header of results page
    And endclose site

    Examples: 
      | bn     | word       |
      | chrome | India      |
      | edge   | Steve Jobs |
      | chrome | Modi       |
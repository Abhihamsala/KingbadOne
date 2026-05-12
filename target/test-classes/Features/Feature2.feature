Feature: Title ttd of your feature

  Scenario Outline: verify Title of your ttd page
    Given I open "<bn>" browser
    When I launch google site
    Then I should see "Google" titled page
    When I should see "<word>" page title
    And I hit ENTRY Key
    Then I should see "<word>" in the header of results page
    And endclose site

    Examples: 
      | bn     | word       |
      | chrome | India      |
      | edge   | Steve Jobs |
      | chrome | Modi       |
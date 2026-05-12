Feature: Google feature
    
 Scenario: Verify Title of your google page
   Given I open "chrome" browser
   When I launch google site
   Then I should see "Google"  titled page
   And endclose site

  #Scenario: verify Title of your bhargavagoogle page
  #  Then I should see "steve jobs" titled page
  #  And I hit ENTRY Key
   # Then I should see "steve jobs" in the header of results page
   # And endclose site
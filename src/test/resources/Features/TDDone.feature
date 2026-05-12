Feature: Google feature
   
   Background:
    Given I open "chrome" browser
     When I launch google site
    
    @Smoketest @UItest
 Scenario: Validate  google  site launching
   Then I should see "Google"  titled page
   And endclose site
   
 @Smoketest @UItest
   Scenario: Validate the search box
   When I enter for "steve jobs" word in search box and hit ENTER key
   
  
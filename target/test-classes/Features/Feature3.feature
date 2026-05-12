Feature: Google search 

  Background: 
    Given I open "chrome" browser
    When I launch google site
   
    @smoketest @uitest
   Scenario: validate google site launching
   Then I should see "Google"  titled page
 
 @smoketest @e2etest
  Scenario: validate google page  Title after searching a word
    when I should see "steve jobs " word in search box and hit ENTER key
    Then I should see  "steve jobs "  in the title of result page
   
   
Feature: Login, create, delete typeform.

    Scenario: log in
      Given I go to the typeform page
      When I log in as user admin
      Then I am in my workspace

    Scenario: Create a typeform
      Given I go to the typeform page
      And I log in as user admin
      When I add a typeform with data
        | type        | Quizzes                      |
        | nameTemplate| Online Science Quiz Template |
      Then gets this typeform in my workspace

    Scenario: Delete a typeform
      Given I go to the typeform page
      And I log in as user admin
      When I delete the typeform whit name "Science Quiz"
      Then this typeform disappear of my workspace


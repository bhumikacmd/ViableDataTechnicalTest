Feature: Test Functionality of LocationPage


  Scenario: User to navigate to location page
    Given User is on Homepage
    When User click on Location link
    Then User to verify number of locations


  Scenario: User to check location page with data
    Given User is on Homepage
    When User click on Location link
    And User select Schoen, Rau and Windler Square office based on requirements
    And User should check public access is available
    And User should check no parking is set
    Then User to check number of Team Office seats available

  Scenario: User to check location page with data
    Given User is on Homepage
    When User click on Location link
    And User select Sipes Group Complex office based on requirements
    And User should check public access is available
    And User should check no parking is set
    Then User to check number of Team Office seats available

  Scenario: User to check location page with data
    Given User is on Homepage
    When User click on Location link
    And User select Turcotte, Carroll and Hermiston Square office based on requirements
    And User should check public access is available
    And User should check no parking is set
    Then User to check number of Team Office seats available

  Scenario: User to navigate to location page
    Given User is on Homepage
    When User click on Location link
    Then User to verify number of images present for existing locations






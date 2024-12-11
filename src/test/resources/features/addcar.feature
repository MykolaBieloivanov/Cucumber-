Feature: Add Car

  @AddNewCar
  Scenario: Fill out the form to lease out your car
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks in Login link
    And User enters valid data
    And User clicks on Yalla button

    And User opens ilCarro's Let the car work Page

    And User fill in location field
    And User fill in car details field

    And User upload a photo of the car
    And User click the Submit button

    Then User should see a confirmation message
    And User quites browser
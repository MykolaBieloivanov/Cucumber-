package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.LetTheCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LetTheCarWorkSteps {


    @And("User opens ilCarro's Let the car work Page")
    public void openRentPage() {
        new LetTheCarWorkPage(driver).openRentLink();
    }


    @And("User fill in location field")
    public void fill_in_location_field() {
        new LetTheCarWorkPage(driver).chooseLocation("Tel Aviv");

    }

    @And("User fill in car details field")
    public void fill_in_car_details_field() {
        new LetTheCarWorkPage(driver).fillInfo("Opel", "Kadet", "1999", "Diesel", "2", "A", "Nikov73g7", "222");

    }

    @And("User upload a photo of the car")
    public void upload_a_photo_of_the_car(){

    }

    @And("User click the Submit button")
    public void click_the_Submit_button() {
        new LetTheCarWorkPage(driver).submitRentLink();
    }


    @Then("User should see a confirmation message")
    public void confirmation_message() {
        new LetTheCarWorkPage(driver).kaktus("Car added");
    }
}



















package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {


    @And("User clicks in Login link")
    public void clicks_in_Login_link() {

        new HomePage(driver).clickOnLoginLink();
    }


    @And("User enters valid data")
    public void enters_valid_data() {

        new LoginPage(driver).enterData("pinkman@gmail.com", "Qwerty123!");

    }


    @And("User clicks on Yalla button")
    public void clicks_on_Yalla_button() {

        new LoginPage(driver).clicksonYallabutton();

    }

    @Then("User verifies Success message is displayed")
    public void verifies_Success_message() {

        new LoginPage(driver).isMessageTextPresent("Logged in success");

    }

    @And("User enters valid email and wrong password")
    public void enters_valid_email_and_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongData(table);
    }

    @And("User verifies Error message is displayed")
    public void verify_Error() {
        new LoginPage(driver).isMessageTextPresent("Login or Password incorrect");
    }

}





















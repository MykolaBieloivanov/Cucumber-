package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LetTheCarWorkPage extends BasePage {

    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "1")
    WebElement rentLink;


    public LetTheCarWorkPage openRentLink() {
        click(rentLink);
        return this;
    }


    @FindBy(id = "pickUpPlace")
    WebElement locationInput;

    public LetTheCarWorkPage chooseLocation(String text) {
        type(locationInput, text);
        pause(500);
        locationInput.sendKeys(Keys.DOWN);
        locationInput.sendKeys(Keys.ENTER);
        return this;
    }


    @FindBy(id = "make")
    WebElement manufactureField;
    @FindBy(id = "model")
    WebElement modelField;
    @FindBy(id = "year")
    WebElement yearField;
    @FindBy(id = "fuel")
    WebElement fuelField;
    @FindBy(id = "seats")
    WebElement seatsField;
    @FindBy(id = "class")
    WebElement carClassField;
    @FindBy(id = "serialNumber")
    WebElement serialNumberField;
    @FindBy(id = "price")
    WebElement priceField;

    public LetTheCarWorkPage fillInfo(String manufacture, String model, String year, String fuel, String seats, String classs, String serialNumber, String price) {
        type(manufactureField, manufacture);
        type(modelField, model);
        type(yearField, year);

//        Select select = new Select(fuelField);
//        select.selectByVisibleText(fuel);
//        type(fuelField, fuel);

        new Select(fuelField).selectByVisibleText(fuel);

        type(seatsField, seats);
        type(carClassField, classs);
        type(serialNumberField, serialNumber);
        type(priceField, price);


        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;

    public LetTheCarWorkPage submitRentLink() {
        click(submitButton);
        return this;
    }


    //    @FindBy(xpath = "//h1[@class = 'title']")
    //@FindBy(xpath = "//*[@class='title']")
    @FindBy(xpath = "//*[@class='title' and text()='Car added']")

    WebElement carAdded;

    public LetTheCarWorkPage kaktus(String text) {
        pause(1000);
        assert carAdded.getText().contains(text);
        return this;
    }
}

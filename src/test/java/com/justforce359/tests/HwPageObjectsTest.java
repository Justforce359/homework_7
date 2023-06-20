package com.justforce359.tests;

import com.codeborne.selenide.SelenideElement;
import com.justforce359.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class HwPageObjectsTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulTest() {
        registrationPage.openPage()
                .setFirstname("Mikhail")
                .setLastname("Ustinov")
                .setUserEmail("dsvsdv@mail.com")
                .setGender("Male")
                .userNumber("1234567890")
                .setBirthDate("10", "May", "1986")
                .setSubjectsInput("Maths")
                .hobbiesInput("Reading")
                .uploadPic("picture.png")
                .currentAdd("fbv;oksdfolibvjsdifb")
                .stateAndCityInput("Uttar Pradesh", "Agra")
                .submitClick()
                .shouldHave("Thanks for submitting the form");

        registrationPage.resultFormCheck("Student Name", "Mikhail Ustinov")
                .resultFormCheck("Student Email", "dsvsdv@mail.com")
                .resultFormCheck("Student Email", "dsvsdv@mail.com")
                .resultFormCheck("Gender", "Male")
                .resultFormCheck("Mobile", "1234567890")
                .resultFormCheck("Date of Birth", "10 May,1986")
                .resultFormCheck("Subjects", "Maths")
                .resultFormCheck("Hobbies", "Reading")
                .resultFormCheck("Picture", "picture.png")
                .resultFormCheck("Address", "fbv;oksdfolibvjsdifb")
                .resultFormCheck("State and City", "Uttar Pradesh Agra")
                .closeModalWindow();
    }

}

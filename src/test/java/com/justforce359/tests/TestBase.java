package com.justforce359.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBase {

    @BeforeAll
    static void BeforeAll () {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920x1080";


    }

}

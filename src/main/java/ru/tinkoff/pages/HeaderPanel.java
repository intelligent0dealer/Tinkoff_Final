package ru.tinkoff.pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class HeaderPanel {
    private final WebDriver driver;

    public HeaderPanel(WebDriver driver) {
        this.driver = driver;
    }

    public void isLoaded() {
        $$("#footer_30sCr").findBy(text("English")).click();
    }
}

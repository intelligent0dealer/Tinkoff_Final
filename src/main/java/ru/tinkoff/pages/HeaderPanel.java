package ru.tinkoff.pages;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.className;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class HeaderPanel {

    public HeaderPanel() {
        WebDriver driver;
    }

    public void clickOnAllHeaderLinks() {
        ElementsCollection buttons = $$(".header__240ro").shouldBe(sizeGreaterThan(0));
        for(int i = 0; i < buttons.size(); i++) {
            System.out.println("Button text:" + buttons.get(i).text());
            $$(".header__240ro").findBy(text(buttons.get(i).text())).waitUntil(Condition.enabled,10000).click();
            $(".title").shouldNotHave(text("Такой страницы нет"));
            if(i!=0)
                back();
        }
    }
    public void colourTest(){
        $(".header__n-Ztx.header__3dzNq").shouldHave(text("Курсы валют"));
    }
}

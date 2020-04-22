package ru.tinkoff.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class Courses {
    public Courses() {
    }

    public void checkCourse() {
        $(By.id("TCSid1")).shouldHave(exactText("Рубль")).click();
        $(By.id("TCSid3")).shouldHave(exactText("Евро")).click();
    }

    public void checkCourseTable() {
        $(".DesktopExchange__tableRoot_1MoWP").shouldHave(text("€"));
        $(".DesktopExchange__tableRoot_1MoWP").shouldHave(text("₽"));
    }

    public void switchElement() {
        $(By.id("TCSid1")).click();
        $$(".Dropdown__content_3KxXb").findBy(text("Евро")).click();
        $(By.id("TCSid1")).shouldHave(text("Евро"));
        $(By.id("TCSid3")).shouldHave(text("Рубль"));
    }

    public void switchElementToDollar() {
        $(By.id("TCSid3")).click();
        $$(".Dropdown__content_3KxXb").findBy(text("Доллар")).click();
        $(By.id("TCSid3")).shouldHave(text("Доллар"));
    }

    public void checkCourseTableDollar() {
        $(".DesktopExchange__tableRoot_1MoWP").shouldHave(text("€"));
        $(".DesktopExchange__tableRoot_1MoWP").shouldHave(text("$"));
    }
}

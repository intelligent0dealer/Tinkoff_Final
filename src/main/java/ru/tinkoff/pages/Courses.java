package ru.tinkoff.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Courses {

    public static SelenideElement leftDropMenu = $(By.id("TCSid1"));
    public static SelenideElement rightDropMenu = $(By.id("TCSid3"));
    SelenideElement tableTitle = $(".DesktopExchange__tableRoot_1MoWP");
    ElementsCollection dropMenuCourses = $$(".Dropdown__content_3KxXb");


    public Courses() {
    }

    public void checkCourse(String curr_left,String curr_right) {
        leftDropMenu.shouldHave(exactText(curr_left));
        rightDropMenu.shouldHave(exactText(curr_right));
    }

    public void checkCourseTable(String сurr_table_first, String curr_table_second) {
        tableTitle.shouldHave(text(сurr_table_first));
        tableTitle.shouldHave(text(curr_table_second));
    }

    public void switchElement(SelenideElement element, String text) {
        element.click();
        dropMenuCourses.findBy(text(text)).click();
    }
}

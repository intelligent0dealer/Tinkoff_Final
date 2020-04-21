package ru.tinkoff.pages;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;


public class HeaderPanel {

    public HeaderPanel() {
    }

    public void clickOnAllHeaderLinks() {
        ElementsCollection buttons = $$(".header__240ro").shouldBe(sizeGreaterThan(0));
        for(int i = 0; i < buttons.size(); i++) {
            ElementsCollection new_buttons = $$(".header__240ro").shouldBe(sizeGreaterThan(0));
            System.out.print("Go to button: ");
            System.out.println(new_buttons.get(i).getText());
            new_buttons.get(i).waitUntil(Condition.enabled,10000).click();
        }
    }
}

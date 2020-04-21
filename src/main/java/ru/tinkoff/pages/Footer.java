package ru.tinkoff.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

public class Footer {

    public Footer() {
    }

    public void checkElementsFirstHalf() {
        ElementsCollection buttons = $$(".footer__1J191").shouldBe(sizeGreaterThan(0));
        for (int i = 0; i < buttons.size(); i++) {
            ElementsCollection new_buttons = $$(".footer__1J191").shouldBe(sizeGreaterThan(0));
            System.out.print("Go to button: ");
            System.out.println(new_buttons.get(i).getText());
            new_buttons.get(i).waitUntil(Condition.visible, 10000).click();
            back();
        }
    }
}



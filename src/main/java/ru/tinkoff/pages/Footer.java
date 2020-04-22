package ru.tinkoff.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Footer {

    public Footer() {
    }

    public void checkElementsFirstHalf() {
        ElementsCollection buttons = $$(".footer__1J191").shouldBe(sizeGreaterThan(0));
        for(int i = 0; i < buttons.size(); i++) {
            System.out.println("Button text:" + buttons.get(i).text());
            $$(".footer__1J191").findBy(text(buttons.get(i).text())).waitUntil(Condition.enabled,10000).click();
            $(".title").shouldNotHave(text("Такой страницы нет"));
            if(i!=5)
                back();
            if(i==7)
                open("/");

        }
    }
}



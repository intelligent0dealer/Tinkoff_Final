package ru.tinkoff.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Footer {

    ElementsCollection footer = $$("..footer__1J191");
    SelenideElement title = $(".title");

    public Footer() {
    }

    public void clickOnAllFooterElements() {
        ElementsCollection buttons = footer.shouldBe(sizeGreaterThan(0));
        for(int i = 0; i < buttons.size(); i++) {
            System.out.println("Button text:" + buttons.get(i).text());
            footer.findBy(text(buttons.get(i).text())).waitUntil(Condition.enabled,10000).click();
            title.shouldNotHave(text("Такой страницы нет"));
            if(i!=5)
                back();
            if(i==7)
                open("/");

        }
    }
}



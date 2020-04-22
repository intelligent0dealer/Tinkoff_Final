package ru.tinkoff.pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {

    SelenideElement mainHeader = $(".header__1Kj5Q");
    SelenideElement mainFooter = $(".footer__38CF0");
    SelenideElement footer = $(".footer__1J191");
    SelenideElement header = $(".header__240ro");
    SelenideElement leftDropMenu = $(By.id("TCSid1"));
    SelenideElement rightDropMenu = $(By.id("TCSid3"));


        public MainPage() {
    }

    public void pageIsLoaded() {
            mainHeader.shouldBe(Condition.visible);
            mainFooter.shouldBe(Condition.visible);
            header.shouldBe(Condition.visible);
            footer.shouldBe(Condition.visible);
            leftDropMenu.shouldBe(Condition.visible);
            rightDropMenu.shouldBe(Condition.visible);
    }
}

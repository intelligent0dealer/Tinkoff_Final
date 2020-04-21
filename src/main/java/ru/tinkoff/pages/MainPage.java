package ru.tinkoff.pages;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class MainPage {
        public MainPage() {
    }

    public void pageIsLoaded() {
        $(byText("English")).click();
    }
}

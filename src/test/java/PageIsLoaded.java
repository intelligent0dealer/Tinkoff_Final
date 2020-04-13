import com.codeborne.selenide.SelenideConfig;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.tinkoff.pages.HeaderPanel;
import org.openqa.selenium.WebDriver;
import ru.tinkoff.pages.HeaderPanel;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageIsLoaded {
    private WebDriver driver;
    private SelenideConfig config;
    @Before
    public void setUp() {

        open("https://www.tinkoff.ru/about/exchange/");

    }
    @Test
    public void pageIsLoaded() {
        $(byText("Курсы валют")).click();
    }

}


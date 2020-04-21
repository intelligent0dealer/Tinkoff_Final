import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.tinkoff.pages.MainPage;
import config.SelenideCfg;
import static com.codeborne.selenide.Selenide.open;


public class PageIsLoadedTest {
    private SelenideCfg config;

    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/exchange");
    }

    @Test
    public void mainPageIsLoaded() {
        MainPage mainPage = new MainPage();
        mainPage.pageIsLoaded(); // switch to english
    }

}


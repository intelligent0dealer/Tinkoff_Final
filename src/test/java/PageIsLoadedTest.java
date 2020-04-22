import org.junit.Before;
import org.junit.Test;
import ru.tinkoff.pages.MainPage;
import config.SelenideCfg;
import static com.codeborne.selenide.Selenide.open;


public class PageIsLoadedTest {
    private SelenideCfg config;

    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/");
    }

    @Test
    public void mainPageIsLoaded() {
        MainPage mainPage = new MainPage();
        mainPage.pageIsLoaded(); // switch to english
    }

}


import config.SelenideCfg;
import org.junit.Before;
import org.junit.Test;
import ru.tinkoff.pages.HeaderPanel;
import static com.codeborne.selenide.Selenide.open;

public class HeaderIsLoadedTest {
    private SelenideCfg config;

    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/");
    }
    @Test
    public void headerTest() {
        HeaderPanel headerPanel = new HeaderPanel();
        headerPanel.clickOnAllHeaderLinks();
    }
}

import config.SelenideCfg;
import org.junit.Before;
import org.junit.Test;
import ru.tinkoff.pages.Footer;
import static com.codeborne.selenide.Selenide.open;

public class FooterIsLoadedTest {
    private SelenideCfg config;

    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/");
    }
    @Test
    public void footerTest() {
        Footer footer = new Footer();
        footer.checkElementsFirstHalf();
    }
}
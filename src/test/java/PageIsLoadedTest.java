import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.Test;
import ru.tinkoff.pages.Courses;
import ru.tinkoff.pages.Footer;
import ru.tinkoff.pages.HeaderPanel;
import ru.tinkoff.pages.MainPage;
import config.SelenideCfg;
import static com.codeborne.selenide.Selenide.open;
import static ru.tinkoff.pages.Courses.leftDropMenu;
import static ru.tinkoff.pages.Courses.rightDropMenu;


public class PageIsLoadedTest {
    private SelenideCfg config;

    MainPage mainPage = new MainPage();
    Footer footer = new Footer();
    HeaderPanel header = new HeaderPanel();
    Courses courses = new Courses();

    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/");
    }
    @Test
    public void testPage() {
        mainPage.pageIsLoaded();
        header.clickOnAllHeaderLinks();
        header.buttonLined();
        footer.clickOnAllFooterElements();
    }
    @Test
    public void tinkoffTestPageCourses() {
        courses.checkCourse("Рубль", "Евро");
        courses.checkCourseTable("€", "₽");
        courses.switchElement(leftDropMenu, "Евро");
        courses.checkCourse("Евро", "Рубль");
        courses.switchElement(rightDropMenu, "Доллар");
        courses.checkCourse("Евро", "Доллар");
        courses.checkCourseTable("€", "$");
    }
}



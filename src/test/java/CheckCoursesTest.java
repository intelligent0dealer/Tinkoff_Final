import config.SelenideCfg;
import org.junit.Before;
import org.junit.Test;
import ru.tinkoff.pages.Courses;
import static com.codeborne.selenide.Selenide.open;

public class CheckCoursesTest {
    private SelenideCfg config;

    @Before
    public void setUp() {
        config = new SelenideCfg();
        open("/");
    }
    @Test
    public void checkCoursesTest(){
        Courses courses = new Courses();
        courses.checkCourse();
    }
    @Test
    public void checkCoursesTable() {
        Courses courses = new Courses();
        courses.checkCourseTable();
    }
    @Test
    public void switchElement() {
        Courses courses = new Courses();
        courses.switchElement();
        courses.switchElementToDollar();
        courses.checkCourseTableDollar();
    }
}
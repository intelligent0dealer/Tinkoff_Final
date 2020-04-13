package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenideConfig {
    static {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "//driver/chromedriver.exe");
    }

    private WebDriver driver;

    public SelenideConfig() {
        driver=new ChromeDriver();
        Configuration.timeout = 10000;
    }

    public void open(String page) {
        driver.get(page);
    }

    public WebDriver getDriver(){
        return driver;
    }
}


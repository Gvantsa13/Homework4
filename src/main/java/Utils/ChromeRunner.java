package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod
    public void setUp(){
        open("https://my.pensions.ge/ka/user/login");
        Configuration.browserSize = "1920x1080";

    }

}

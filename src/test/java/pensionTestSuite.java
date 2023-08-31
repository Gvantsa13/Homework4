import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class pensionTestSuite extends ChromeRunner {
    @Test
    public void firstTest(){
        $(byName("personalId")).setValue("abrakadabra");
        $(byText("სისტემაში შესვლა")).click();
        $(byText("პირადი ნომერი უნდა შეიცავდეს მხოლოდ ციფრებს")).shouldBe(Condition.visible);

    }

    @Test
    public void secondTest(){
        $(byName("password")).shouldBe(Condition.empty);
        $(byText("სისტემაში შესვლა")).click();
        $(byText("გთხოვთ მიუთითოთ პაროლი")).shouldBe(Condition.visible);

    }

    @Test
    public void thirdTest(){
        $(".id-card-login__link");
        $(byPartialLinkText("პირად"));

    }

    @Test
    public void fourthTest(){
        $(".login__registration-link").click();
        $(byText("ავტორიზაცია"));

    }

}

package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void testRepositoryIssue (){
        open("https://github.com");

        $("[placeholder='Search GitHub']").setValue("Selenide/selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
        $("#issues-tab").click();
        $(withText("#2039")).shouldBe(Condition.visible);


        sleep(5000);
    }

}
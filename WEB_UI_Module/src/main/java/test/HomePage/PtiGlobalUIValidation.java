package test.HomePage;

import BaseClasses.PtiAnalyticsBaseTest;
import ImplementationClasses.AfdalAnalyticsSignInImpl;
import ImplementationClasses.PtiGobalLoginImpl;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;



public class PtiGlobalUIValidation extends PtiAnalyticsBaseTest {

    @Test

    public void verifyHomePage() {



        add(new PtiGobalLoginImpl()).trigger();
    }




}

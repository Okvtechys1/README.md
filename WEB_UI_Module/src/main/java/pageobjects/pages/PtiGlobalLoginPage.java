package pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageobjects.PageFactoryClasses.PtiGlobalPageFactory;

import static com.codeborne.selenide.Selenide.*;

public class PtiGlobalLoginPage implements IPtiGlobalLoginPage {

    SelenideElement email = $x("//input[@id = 'UserName']");
    SelenideElement password = $x("//input[@id = 'Password']");

    SelenideElement login_btn = $x("//button[@id = 'cmdLogin']");

    SelenideElement header = $x("//a[text()=\" Screen-shot Tool \"]");

    SelenideElement operations = $x("//span[text()='Operations']");

    SelenideElement GetBugReportJira = $x("//*[@id=\"sidebar-menu\"]/ul[2]/li/ul/li[2]/a");

    SelenideElement Project = $x("//*[(@id = \"ProjectId\")]");

    SelenideElement Device = $x("//*[(@id = \"DeviceId\")]");

    SelenideElement Build = $x("//*[(@id = \"Build\")]");

    SelenideElement Workflow = $x("//*[(@id = \"WorkFlow\")]");

    SelenideElement GetBugReportJiraButton = $x("//*[(@id = \"btnExistingBugRpt\")]");
    @Override
    public IPtiGlobalLoginPage enterEmail() {
        email.sendKeys("testdemo2");
        return PtiGlobalPageFactory.getLoginpage();
    }

    @Override
    public IPtiGlobalLoginPage enterPassword() {
        password.sendKeys("123456789");
        return PtiGlobalPageFactory.getLoginpage();

    }

    @Override
    public IPtiGlobalLoginPage clickOnSigninButton() {
        login_btn.click();
        return PtiGlobalPageFactory.getLoginpage();
    }


    @Override
    public IPtiGlobalLoginPage verifyHeader() {


        header.waitUntil(Condition.visible, 1000).isDisplayed();

        String header1 = header.getText();


        System.out.println(header1);


        Assert.assertEquals(header1, "Screen-shot Tool");


        return PtiGlobalPageFactory.getLoginpage();
    }

    @Override
    public IPtiGlobalLoginPage verifyGetBugReportsFromJira() throws InterruptedException {

        Thread.sleep(2000);
        operations.click();

       GetBugReportJira.click();

       Project.selectOption("PTIG");

       Device.waitUntil(Condition.visible,1000).isDisplayed();

       Device.selectOption("IOS15");

       Thread.sleep(2000);

       Build.selectOption("Build 1.5.1");

       Thread.sleep(2000);

       Workflow.selectOption("Workflow 1.5.1");

       GetBugReportJiraButton.click();

        Alert alert = switchTo().alert();
        String text = alert.getText();
        System.out.println(text);

//        Assert.assertEquals(text, "Please enter a valid user name");


        return PtiGlobalPageFactory.getLoginpage();



    }





}

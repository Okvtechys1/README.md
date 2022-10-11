package pageobjects.pages;

public interface IPtiGlobalLoginPage {

    IPtiGlobalLoginPage  enterEmail();
    IPtiGlobalLoginPage  enterPassword();
    IPtiGlobalLoginPage  clickOnSigninButton();

    IPtiGlobalLoginPage verifyHeader();

    IPtiGlobalLoginPage verifyGetBugReportsFromJira() throws InterruptedException;




}

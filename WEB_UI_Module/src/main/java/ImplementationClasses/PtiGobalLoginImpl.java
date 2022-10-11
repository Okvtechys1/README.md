package ImplementationClasses;


import BaseClasses.Feature;
import BaseClasses.PtiGlobalSigninPage;

import pageobjects.pages.IPtiGlobalLoginPage;

public class PtiGobalLoginImpl extends PtiGlobalSigninPage implements Feature {
    private IPtiGlobalLoginPage homePage;
    @Override
    public void init()
    {
        homePage = openPtiGlobalLoginPage();
    }

    @Override
    public void execute() {
        try {

            homePage.enterEmail().enterPassword().clickOnSigninButton().verifyHeader().verifyGetBugReportsFromJira();
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}

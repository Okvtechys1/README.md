package BaseClasses;

import pageobjects.PageFactoryClasses.PtiGlobalPageFactory;
import pageobjects.pages.IPtiGlobalLoginPage;

import static com.codeborne.selenide.Selenide.open;
import static data.SystemProperties.AFDALANALYTICS_URL;

public class PtiGlobalSigninPage {

    public IPtiGlobalLoginPage openPtiGlobalLoginPage()
    {
        open(AFDALANALYTICS_URL);

        return PtiGlobalPageFactory.getLoginpage();
    }

}

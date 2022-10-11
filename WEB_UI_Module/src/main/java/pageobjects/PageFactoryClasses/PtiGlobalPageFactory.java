package pageobjects.PageFactoryClasses;

import pageobjects.pages.IPtiGlobalLoginPage;
import pageobjects.pages.PtiGlobalLoginPage;

public class PtiGlobalPageFactory extends PageFactory{

    public static IPtiGlobalLoginPage getLoginpage()
    {
        return wrap(new PtiGlobalLoginPage(), IPtiGlobalLoginPage.class);
    }
}

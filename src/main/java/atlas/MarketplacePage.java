package atlas;

import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("ALL")




public interface MarketplacePage extends WebPage {

    @Description("Side bar Menu")
    @FindBy("//div[@class='MarketplaceBody']//nav/ul/li")
    ElementsCollection sideBarMenu();

}

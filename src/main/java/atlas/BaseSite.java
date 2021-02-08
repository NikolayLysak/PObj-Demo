package atlas;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import io.qameta.atlas.webdriver.extension.Param;
import io.qameta.atlas.webdriver.extension.Query;

public interface BaseSite extends WebSite {

    @Page
    MainPage onMainPage();

    @Page(url = "/marketplace")
    MarketplacePage onMarketplacePage();

    @Page(url = "/search")
    ProjectPage onProjectPage(@Query("q") String value);

}

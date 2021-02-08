import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.yandex.qatools.matchers.webdriver.EnabledMatcher.enabled;
import static ru.yandex.qatools.matchers.webdriver.ExistsMatcher.exists;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;
import static tools.PageManager.getPage;

public class Test1 extends BaseTestClass {

    @Test
    public void test_page_objects() {
        Assert.assertTrue(getPage().startPage.getMarketplaceLink().isDisplayed(), "something wrong!");
        getPage().startPage.getMarketplaceLink().click();
    }

    @Test
    public void test_atlas() {
        onSite().onMainPage().header().searchInputField().should(exists());
        onSite().onMainPage().header().searchInputField().waitUntil(enabled()).sendKeys("PObj-Demo" + Keys.ENTER);
        onSite().onProjectPage("PObj-Demo").projectLink().should(text("NikolayLysak/PObj-Demo"));
        onSite().onProjectPage("PObj-Demo").header().homeButton().waitUntil(enabled()).click();
    }
}

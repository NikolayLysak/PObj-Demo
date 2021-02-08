package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    @FindBy(xpath = "//summary[contains(text(),'Why GitHub')]")
    private WebElement whyGithubListLink;

    @FindBy(xpath = "//summary[contains(text(),'Explore')]")
    private WebElement exploreListLink;

    @FindBy(xpath = "//summary[contains(text(),'Pricing')]")
    private WebElement pricingLisLink;

    @FindBy(xpath = "//a[text()='Team']/parent::li")
    private WebElement teamLink;

    @FindBy(xpath = "//a[text()='Enterprise']/parent::li")
    private WebElement enterpriseLink;

    @FindBy(xpath = "//a[text()='Marketplace']/parent::li")
    private WebElement marketplaceLink;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWhyGithubSummary() {
        return whyGithubListLink;
    }

    public WebElement getExploreLink() {
        return exploreListLink;
    }

    public WebElement getPricingLink() {
        return pricingLisLink;
    }

    public WebElement getTeamLink() {
        return teamLink;
    }

    public WebElement getEnterpriseLink() {
        return enterpriseLink;
    }

    public WebElement getMarketplaceLink() {
        return marketplaceLink;
    }
}
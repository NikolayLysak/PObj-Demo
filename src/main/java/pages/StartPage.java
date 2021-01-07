package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class StartPage extends BasePage {

    //---> CAROUSEL
    @FindBy(xpath = "//*[@id='carouselExampleCaptions']")
    private WebElement carouselMainPage;

    //---> MODELS BLOCK
    @FindBys({@FindBy(xpath = "//*[@class='card card-mpmodel']/img")})
    private List<WebElement> listOfModelCardImages;

    //---> FOOTER
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='+38 (057) 777-07-00']")
    private WebElement footerProneFirst;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='+38 (050) 577-07-00']")
    private WebElement footerProneSecond;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='+38 (098) 477-07-00']")
    private WebElement footerProneThird;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='+38 (073) 447-07-00']")
    private WebElement footerProneForth;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Yaris']")
    private WebElement footerModelYaris;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Corolla']")
    private WebElement footerModelCorolla;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Camry']")
    private WebElement footerModelCamry;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='C-HR']")
    private WebElement footerModelC_HR;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='RAV4']")
    private WebElement footerModelRAV4;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Highlander']")
    private WebElement footerModelHighlander;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Prado']")
    private WebElement footerModelPrado;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='LC 200']")
    private WebElement footerModelLC_200;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Hilux']")
    private WebElement footerModelHilux;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Авто в наявності']")
    private WebElement footerAutoInStock;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Авто з пробігом']")
    private WebElement footerAutoWithMileage;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Запис на тест-драйв']")
    private WebElement footerTestDrive;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Запис на сервіс']")
    private WebElement footerService;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Брошури та каталоги']")
    private WebElement footerCatalogues;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Toyota Assistance']")
    private WebElement footerToyotaAssistance;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Моя Тойота']")
    private WebElement footerMyToyota;
    @FindBy(xpath = "//*[contains(@class,'footer-main')]//a[text()='Акції']")
    private WebElement footerActions;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    //---> GETTERS
    public WebElement getCarouselMainPage() {
        return carouselMainPage;
    }

    public List<WebElement> getListOfModelCards() {
        return listOfModelCardImages;
    }

    public WebElement getFooterProneFirst() {
        return footerProneFirst;
    }

    public WebElement getFooterProneSecond() {
        return footerProneSecond;
    }

    public WebElement getFooterProneThird() {
        return footerProneThird;
    }

    public WebElement getFooterProneForth() {
        return footerProneForth;
    }

    public WebElement getModelYaris() {
        return footerModelYaris;
    }

    public WebElement getFooterModelCorolla() {
        return footerModelCorolla;
    }

    public WebElement getFooterModelCamry() {
        return footerModelCamry;
    }

    public WebElement getFooterModelC_HR() {
        return footerModelC_HR;
    }

    public WebElement getFooterModelRAV4() {
        return footerModelRAV4;
    }

    public WebElement getFooterModelHighlander() {
        return footerModelHighlander;
    }

    public WebElement getFooterModelHilux() {
        return footerModelHilux;
    }

    public WebElement getFooterModelLC_200() {
        return footerModelLC_200;
    }

    public WebElement getFooterModelPrado() {
        return footerModelPrado;
    }

    public WebElement getFooterAutoInStock() {
        return footerAutoInStock;
    }

    public WebElement getFooterAutoWithMileage() {
        return footerAutoWithMileage;
    }

    public WebElement getFooterTestDrive() {
        return footerTestDrive;
    }

    public WebElement getFooterService() {
        return footerService;
    }

    public WebElement getFooterActions() {
        return footerActions;
    }

    public WebElement getFooterMyToyota() {
        return footerMyToyota;
    }

    public WebElement getFooterToyotaAssistance() {
        return footerToyotaAssistance;
    }

    public WebElement getFooterCatalogues() {
        return footerCatalogues;
    }

    //---> STEPS

    @Step("Open Yaris model page after click by footer link")
    public void openYarisModelPageFromFooter() {
        this.footerModelYaris.click();
    }

    @Step("Open Corolla model page after click by footer link")
    public void openCorollaModelPageFromFooter() {
        this.footerModelCorolla.click();
    }

    //---> etc.
}
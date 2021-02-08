package atlas;

import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("ALL")




public interface Header extends AtlasWebElement {

    @Description("HomePage Button")
    @FindBy("//a[@aria-label='Homepage']/parent::div")
    AtlasWebElement homeButton();

    @Description("Header element - {{ text }}")
    @FindBy("//a[text()='{{ text }}']/parent::li")
    AtlasWebElement headerLink(@Param("text") String text);

    @Description("Header element - {{ text }}")
    @FindBy("//summary[contains(text(),{{ text }})]")
    AtlasWebElement headerList(@Param("text") String text);

    @Description("Header search field")
    @FindBy("//input[@name='q']")
    AtlasWebElement searchInputField();

    @Description("Header Sign In Button")
    @FindBy("//*[contains(@data-ga-click, 'Sign in')]")
    AtlasWebElement signInButton();

    @Description("Header Sign Up Button")
    @FindBy("//*[contains(@data-ga-click, 'Sign up')]")
    AtlasWebElement signUpButton();


}

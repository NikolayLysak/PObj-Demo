package atlas;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")



public interface MainPage extends WebPage, WithHeader {

    @FindBy("//input[@name='user_email']")
    AtlasWebElement userEmail();

    @FindBy("//button[@type='submit']")
    AtlasWebElement submitButton();

}

package atlas;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("ALL")




public interface ProjectPage extends WebPage, WithHeader {

    @FindBy("//a[@class='v-align-middle']")
    AtlasWebElement projectLink();
}

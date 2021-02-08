package atlas;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;


@SuppressWarnings("ALL")




public interface WithHeader extends AtlasWebElement {

    @FindBy("//header")
    Header header();

}

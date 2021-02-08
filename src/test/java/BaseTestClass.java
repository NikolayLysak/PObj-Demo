import atlas.BaseSite;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tools.PageManager;

import static tools.InitDriver.closeDriver;
import static tools.InitDriver.getDriver;

public abstract class BaseTestClass {

    protected WebDriver driver = getDriver();
    static final String BASE_URL = "https://github.com/";

    Atlas atlas = new Atlas(new WebDriverConfiguration(driver, BASE_URL));


    private final ThreadLocal<BaseSite> instance = new ThreadLocal<>();

    public BaseSite onSite() {
        if (instance.get() == null) {
            instance.set(atlas.create(driver, BaseSite.class));
        }
        return instance.get();
    }


    @BeforeClass(enabled = false)
    public void setUp() {

        System.out.println("This BEFORE CLASS BLOCK");
        System.out.println("Atlas initiation");
    }

    @AfterClass()
    public void tearDown() {
        closeDriver();
    }
}


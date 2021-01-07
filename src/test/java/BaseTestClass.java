import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tools.InitDriver;

import static tools.InitDriver.closeDriver;
import static tools.InitDriver.getDriver;

public abstract class BaseTestClass {

    protected WebDriver driver = getDriver();

    @BeforeClass(enabled = true)
    public void start() {
        System.out.println("This BEFORE CLASS BLOCK");
        driver.get("https://toyota.kharkov.ua/");
    }

    @AfterClass(enabled = true)
    public void end() {
        closeDriver();
    }
}

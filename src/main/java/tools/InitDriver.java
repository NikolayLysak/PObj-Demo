package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InitDriver {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {

        if (webDriver.get() == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\WorkDir\\meetup-page-object-demo\\driver\\chromedriver.exe");
            webDriver.set(new ChromeDriver());
            webDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return webDriver.get();
    }

    public static void closeDriver() {
        if (webDriver.get() != null) {
            webDriver.get().close();
        }
    }

}

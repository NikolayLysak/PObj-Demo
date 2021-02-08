package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class InitDriver {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {

        if (webDriver.get() == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\WorkDir\\meetup-page-object-demo\\driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("window-size=1600,900");
            webDriver.set(new ChromeDriver(options));
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

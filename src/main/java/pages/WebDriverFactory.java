package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
    private WebDriverFactory() {
        throw new IllegalStateException("Utility class");
    }

    public static WebDriver createDriver(Browser type) {
        switch (type) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            default:
                return null;
        }
    }

    public static WebDriver createDriver(Browser type, MutableCapabilities wdOptions){
        switch (type){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver( (ChromeOptions) wdOptions);
            default:
                return null;
        }
    }
}

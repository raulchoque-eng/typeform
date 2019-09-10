package core.selenium;

import core.selenium.webdrivers.Browser;
import core.selenium.webdrivers.FactoryBrowser;
import org.openqa.selenium.WebDriver;

/**
 * WebDriverManager class, manage the WebDriver
 * to use in our project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class WebDriverManager {

    private static WebDriverManager webDriverManager;
    private WebDriver driver;

    /**
     * Constructor of WebDriverManager class.
     */
    private WebDriverManager() {
        driver = createWebDriver(WebDriverConfig.getInstance().getNameBrowser());
    }

    /**
     * Gets single instance WebDriverManager class.
     *
     * @return a WebDriverManager object.
     */
    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    /**
     * Creates a WebDriver specific object from nameBrowser.
     *
     * @param nameBrowser uses to create a WebDriver object.
     * @return a WebDriver object.
     */
    private WebDriver createWebDriver(final String nameBrowser) {
        Browser browser = FactoryBrowser.getBrowser(nameBrowser);
        return browser.getDriver();
    }

    /**
     * Gets driver attribute of this class.
     *
     * @return a WebDriver object.
     */
    public WebDriver getDriver() {
        return driver;
    }
}

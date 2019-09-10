package website.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * BasePage class, initialise BasePage class
 * and all webElement into it.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public abstract class BasePage {

    protected WebDriver driver;

    /**
     * Constructor of BasePage class.
     */
    public BasePage() {
        this.driver = WebDriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
}

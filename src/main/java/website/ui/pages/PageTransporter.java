package website.ui.pages;

import core.selenium.ProjectProperties;
import core.selenium.WebDriverManager;
import core.selenium.utils.ReaderFile;
import org.openqa.selenium.WebDriver;

/**
 * PageTransporter class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class PageTransporter {

    private static PageTransporter pageTransporter;
    private WebDriver driver;

    /**
     * Constructor of PageTransporter class.
     */
    private PageTransporter() {
        driver = WebDriverManager.getInstance().getDriver();
    }

    /**
     * Gets single instance of PageTransporter class.
     *
     * @return a PageTransporter object.
     */
    public static PageTransporter getInstance() {
        if (pageTransporter == null) {
            pageTransporter = new PageTransporter();
        }
        return pageTransporter;
    }

    /**
     * Navigates to login page use the URL.
     *
     * @return a Login object.
     */
    public Login navigateLoginPage() {
        navigateURL(ProjectProperties.URL_LOGIN.getValue());
        return new Login();
    }

    /**
     * Navigates using the URL location.
     *
     * @param url is address to navigate.
     */
    private void navigateURL(final String url) {
        try {
            driver.get(ReaderFile.getInstance().getProperty(url));
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}

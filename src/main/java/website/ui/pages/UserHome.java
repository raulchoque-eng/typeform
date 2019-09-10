package website.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * UserHome class, create a PageObject of UserHome page
 * to interact with the UI of that page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class UserHome extends BasePage {

    @FindBy(css = " #manageSites > h1")
    private WebElement titlePageTxt;

    /**
     * Get the title from titlePageTxt of UserHome page.
     *
     * @return as Sting the text from titlePageTxt.
     */
    public String getTitlePage() {
        return titlePageTxt.getText();
    }
}

package website.ui.pages;

import core.selenium.utils.ReaderFile;
import core.selenium.utils.WebDriverMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Login class, create a PageObject of Login page
 * to interact with the UI of that page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Login extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameTxt;

    @FindBy(id = "password")
    private WebElement passwordTxt;

    @FindBy(xpath = "//button[@id='signin-submit2' or @title='Log In']")
    private WebElement logInBtn;

    /**
     * Writes in usernameTxt WebElement the username parameter.
     *
     * @param username is to write in usernameTxt WebElement.
     */
    public void writeInUsername(final String username) {
        WebDriverMethod.setTxtElement(passwordTxt, username);
    }

    /**
     * Writes in passwordTxt WebElement the password parameter.
     *
     * @param password is to write in passwordTxt WebElement.
     */
    public void writeInPassword(final String password) {
        WebDriverMethod.setTxtElement(passwordTxt, password);
    }

    /**
     * Clicks to submit login form.
     */
    public void clickSubmit() {
        logInBtn.click();
    }

    /**
     * LogIn with username and password parameter.
     *
     * @param username is to complete in LogIn form.
     * @param password is to complete in LogIn form.
     */
    public void logIn(final String username, final String password) {
        writeInUsername(ReaderFile.getInstance().getProperty(username));
        writeInPassword(ReaderFile.getInstance().getProperty(password));
        clickSubmit();
    }
}

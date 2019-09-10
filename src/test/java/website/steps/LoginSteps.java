package website.steps;

import cucumber.api.java.en.Given;
import website.ui.pages.Login;
import website.ui.pages.PageTransporter;

/**
 * LoginSteps class, is the step implementation
 * to Automation of Login page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class LoginSteps {

    private PageTransporter pageTransporter = PageTransporter.getInstance();
    private Login login;

    /**
     * Login in the page with username and password.
     *
     * @param username is to fill the login form.
     * @param password is to fill the login form.
     */
    @Given("^I login in Website page with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginInWebsitePageWithAnd(final String username, final String password) {
        login = pageTransporter.navigateLoginPage();
        login.logIn(username, password);
    }
}

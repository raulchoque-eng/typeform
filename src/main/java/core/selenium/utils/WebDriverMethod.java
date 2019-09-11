package core.selenium.utils;

import org.openqa.selenium.WebElement;

/**
 * WebDriverMethod class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class WebDriverMethod {

    /**
     * Sets text in the WebElement object.
     *
     * @param webElement to set its text.
     * @param text is the new value to send in sendKeys parameter.
     */
    public static void setTxtElement(final WebElement webElement, final String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }
}

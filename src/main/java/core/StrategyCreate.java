package core;

import core.selenium.webdrivers.Browser;

/**
 * StrategyCreate class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
@FunctionalInterface
public interface StrategyCreate {

    /**
     * Execute method to create a Browser.
     *
     * @return a Browser object.
     */
    Browser executeMethod();
}

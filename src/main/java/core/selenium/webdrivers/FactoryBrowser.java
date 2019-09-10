package core.selenium.webdrivers;

import core.StrategyCreate;

import java.util.HashMap;

/**
 * FactoryBrowser class, create a specific Browser object.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class FactoryBrowser {

    /**
     * Gets Browser with the parameter nameBrowser.
     *
     * @param nameBrowser use to create a Browser object.
     * @return a Browser object.
     */
    public static Browser getBrowser(final String nameBrowser) {
        final HashMap<String, StrategyCreate> strategyMap = composeStrategyMap();
        return strategyMap.get(nameBrowser).executeMethod();

    }

    /**
     * Creates a compose strategy map with Browser name and Strategy  interface.
     *
     * @return a HashMap object.
     */
    private static HashMap<String, StrategyCreate> composeStrategyMap() {
        HashMap<String, StrategyCreate> mapWithBrowser = new HashMap<>();
        mapWithBrowser.put("chrome", () -> Chrome.getInstance());
        mapWithBrowser.put("firefox", () -> Firefox.getInstance());
        return mapWithBrowser;
    }
}

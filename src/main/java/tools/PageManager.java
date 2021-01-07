package tools;

import pages.*;

public class PageManager {

    public final StartPage startPage;

    private static ThreadLocal<PageManager> instance = new ThreadLocal<PageManager>();

    public static PageManager getPage() {
        if (instance.get() == null) {
            instance.set(new PageManager());
        }
        return instance.get();
    }

    private PageManager() {
        startPage = new StartPage(InitDriver.getDriver());
    }
}


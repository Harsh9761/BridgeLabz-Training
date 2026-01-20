package BrowserBuddyProblem;

public class BrowserBuddyApp {

	public static void main(String[] args) {
		BrowserBuddy manager = new BrowserBuddy();
        BrowserTab tab = new BrowserTab();

        tab.visit("google.com");
        tab.visit("facebook.com");
        tab.visit("Instagram.com");

        tab.back();
        tab.forward();

        manager.closeTab(tab);

        BrowserTab restoredTab = manager.restoreTab();
        if (restoredTab != null) {
            System.out.println("Current Page: " + restoredTab.getCurrentPage());
        }

	}

}

package BrowserBuddyProblem;
import java.util.*;
public class BrowserBuddy {
	Stack<BrowserTab> closedTabs = new Stack<>();

    public void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed.");
    }

    public BrowserTab restoreTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("Tab restored.");
            return closedTabs.pop();
        }
        System.out.println("No tabs to restore.");
        return null;
    }
}

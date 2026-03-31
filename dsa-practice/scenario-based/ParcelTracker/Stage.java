package ParcelTracker;

public class Stage {
	String status;
    Stage next;

    Stage(String status) {
        this.status = status;
        this.next = null;
    }
}

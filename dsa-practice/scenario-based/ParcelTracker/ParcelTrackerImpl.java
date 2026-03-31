package ParcelTracker;

public class ParcelTrackerImpl {
	private Stage head;

    public void addStage(String status) {
        Stage newStage = new Stage(status);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        Stage temp = head;

        while (temp != null && !temp.status.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        Stage checkpoint = new Stage(newStage);
        checkpoint.next = temp.next;
        temp.next = checkpoint;
    }

    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is lost. No tracking available.");
            return;
        }

        Stage temp = head;
        while (temp != null) {
            System.out.print(temp.status);
            if (temp.next != null) System.out.print(" - ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void markLost() {
        head = null;
    }
}

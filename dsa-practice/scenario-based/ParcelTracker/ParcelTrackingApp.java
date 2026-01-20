package ParcelTracker;

public class ParcelTrackingApp {

	public static void main(String[] args) {
		ParcelTrackerImpl tracker = new ParcelTrackerImpl();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        System.out.println("Initial Tracking:");
        tracker.trackParcel();

        tracker.addCheckpoint("Shipped", "Custom Checkpoint - Hub Scan");

        System.out.println("\nAfter Adding Checkpoint:");
        tracker.trackParcel();

        tracker.markLost();

        System.out.println("\nAfter Parcel Lost:");
        tracker.trackParcel();

	}

}

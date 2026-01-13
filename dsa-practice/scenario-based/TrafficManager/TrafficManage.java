package TrafficManager;

public class TrafficManage {
	VehicleNode head = null;

    void addToRoundabout(String vehicle) {
        VehicleNode newNode = new VehicleNode(vehicle);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println(vehicle + " entered the roundabout");
    }

    void removeFromRoundabout(String vehicle) {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode curr = head, prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicle)) {
                if (curr == head) {
                    VehicleNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println(vehicle + " exited the roundabout");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found in roundabout");
    }

    void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout Vehicles: ");
        VehicleNode temp = head;
        do {
            System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

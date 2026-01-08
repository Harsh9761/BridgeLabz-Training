class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    
    ItemNode next;
    public ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private ItemNode head;


    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newItem = new ItemNode(id, name, qty, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newItem = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newItem;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    public void addAtPosition(int position, int id, String name, int qty, double price) {
        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode newItem = new ItemNode(id, name, qty, price);
        ItemNode temp = head;
        int count = 1;

        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) return;

        newItem.next = temp.next;
        temp.next = newItem;
    }


    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed ");
            return;
        }

        ItemNode prev = head;
        ItemNode curr = head.next;

        while (curr != null) {
            if (curr.itemId == id) {
                prev.next = curr.next;
                System.out.println("Item removed ");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Item not found");
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found");
    }

    public void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value 💰 = " + total);
    }

    public void display() {
        if (head == null) {
            System.out.println("Inventory empty 📭");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }
    
    public ItemNode getMiddle(ItemNode head) {
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void printItem(ItemNode item) {
        System.out.println("ID: " + item.itemId +", Name: " + item.itemName +", Qty: " + item.quantity +", Price: " + item.price);
    }
}


public class InventoryManagementSystem {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();

        inventory.addAtEnd(101, "Pen", 50, 10);
        inventory.addAtEnd(102, "Notebook", 20, 50);
        inventory.addAtBeginning(103, "Pencil", 100, 5);

        inventory.display();

        inventory.updateQuantity(101, 60);
        inventory.searchByName("Notebook");

        inventory.totalInventoryValue();

        System.out.println("After sorting by price ↑");
        inventory.display();

	}

}

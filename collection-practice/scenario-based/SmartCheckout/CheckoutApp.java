package SmartCheckout;

import java.util.*;
public class CheckoutApp {

	public static void main(String[] args) {
		HashMap<String, Item> inventory = new HashMap<>();
        inventory.put("Milk", new Item(50, 10));
        inventory.put("Bread", new Item(30, 5));
        inventory.put("Eggs", new Item(6, 20));

        Queue<Customer> queue = new LinkedList<>();

        queue.add(new Customer("Amit", new String[]{"Milk", "Bread"}));
        queue.add(new Customer("Neha", new String[]{"Eggs", "Milk"}));

        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            double total = 0;

            System.out.println("\nBilling: " + c.name);

            for (String itemName : c.items) {

                if (!inventory.containsKey(itemName)) {
                    System.out.println(itemName + " not available");
                    continue;
                }

                Item item = inventory.get(itemName);

                if (item.stock > 0) {
                    total += item.price;
                    item.stock--;
                    System.out.println(itemName + " : " + item.price);
                } else {
                    System.out.println(itemName + " out of stock");
                }
            }

            System.out.println("Total Bill: " + total);
        }

	}

}

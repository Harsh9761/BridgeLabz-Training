package DigitalSubscriptionRenewalSystem;

import java.time.LocalDate;
import java.util.*;

public class SubscriptionSystem {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Harsh",
                LocalDate.now().minusDays(2),
                500,
                new FestivalDiscount()));

        users.add(new User("Aman",
                LocalDate.now().plusDays(5),
                500,
                new NoDiscount()));

        for (User user : users) {

            if (user.isExpired()) {
                System.out.println(user.name + " subscription expired.");

                try {
                    user.renew();
                } catch (PaymentDeclinedException e) {
                    System.out.println(e.getMessage());
                }

            } else {
                System.out.println(user.name + " subscription active.");
            }
        }
    }
}

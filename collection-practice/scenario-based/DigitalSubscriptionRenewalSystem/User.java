package DigitalSubscriptionRenewalSystem;

import java.time.LocalDate;

public class User {
    String name;
    LocalDate expiryDate;
    double subscriptionFee;
    DiscountStrategy discountStrategy;

    public User(String name, LocalDate expiryDate,
                double subscriptionFee,
                DiscountStrategy discountStrategy) {

        this.name = name;
        this.expiryDate = expiryDate;
        this.subscriptionFee = subscriptionFee;
        this.discountStrategy = discountStrategy;
    }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    public void renew() throws PaymentDeclinedException {

        if (Math.random() < 0.2) {
            throw new PaymentDeclinedException("Payment failed for " + name);
        }

        double finalAmount = discountStrategy.applyDiscount(subscriptionFee);
        expiryDate = expiryDate.plusMonths(1);

        System.out.println(name + " renewed. Paid: " + finalAmount);
    }
}

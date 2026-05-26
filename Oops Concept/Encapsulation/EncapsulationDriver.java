package com.Oops.Encapsulation;

class SimCard {
    // Data hiding
    private String mobileNumber;
    private double balance;

    // Getter method
    public String getMobileNumber() {
        return mobileNumber;
    }

    // Setter method
    public void setMobileNumber(String mobileNumber) {
        if(mobileNumber.length() == 10) {
            this.mobileNumber = mobileNumber;
        } else {
            System.out.println("Invalid Phone Number length!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void recharge(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }
}

public class EncapsulationDriver {
    public static void main(String[] args) {
        SimCard sim = new SimCard();

        // sim.balance = 500;
        // Error: balance has private access in SimCard

        sim.setMobileNumber("9876543210");
        sim.recharge(50.0);

        System.out.println(STR."Mobile Number: \{sim.getMobileNumber()}");
        System.out.println(STR."Current Balance: INR \{sim.getBalance()}");
    }
}

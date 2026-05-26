package com.Oops.Abstratction;

// 1. The Abstract Class (The Blueprint)
abstract class Sim {
    // Instance variables (Encapsulated state shared by all SIMs)
    private final String operatorName;
    private boolean isActivated;

    // Constructor: Abstract classes CAN have constructors to initialize shared data
    public Sim(String operatorName) {
        this.operatorName = operatorName;
        this.isActivated = false; // default state
    }

    // Concrete Method: Shared behavior implemented here once
    public void activateSim() {
        this.isActivated = true;
        System.out.println(STR."\{operatorName} SIM card has been successfully activated.");
    }


    public String getOperatorName() {
        return operatorName;
    }


    public abstract void call();
}


class Jio extends Sim {

    public Jio() {
        super("Jio");
    }


    @Override
    public void call() {
        System.out.println("Connecting VoLTE call via Jio 5G Network...");
    }
}

// 3. Concrete Subclass 2
class Airtel extends Sim {
    public Airtel() {
        super("Airtel");
    }

    @Override
    public void call() {
        System.out.println("Connecting high-definition voice call via Airtel Network...");
    }
}

// 4. Execution Driver Class
public class Driver2 {
    public static void main(String[] args) {

        Sim mySim = new Jio();
        mySim.activateSim();

        mySim.call();

        // Switching the SIM seamlessly
        mySim = new Airtel();
        mySim.activateSim();
        mySim.call();
    }
}

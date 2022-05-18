package Polymorphism;

public class Car extends Vehicle {
    public void MaxSpeed(double legalLimit ){

        // Let's assume that the legal speed limit of cars can change by 25% maximum.
        legalLimit = (legalLimit * 0.25) + legalLimit;
        String stringSpeedLimit =  String.format("Car legal max speed : %s", legalLimit);
        System.out.println(stringSpeedLimit);
    }

}

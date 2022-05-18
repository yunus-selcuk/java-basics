package Polymorphism;

public class Bus extends Vehicle {
    public void MaxSpeed(double legalLimit ){

        // Let's assume that the legal speed limit of buses can change by 10% maximum.
        legalLimit = (legalLimit * 0.1) + legalLimit;
        String stringSpeedLimit =  String.format("Bus max legal speed : %s", legalLimit);
        System.out.println(stringSpeedLimit);
    }

}

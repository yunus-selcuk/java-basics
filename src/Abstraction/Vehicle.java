package Abstraction;

public abstract class Vehicle {

    public abstract void taxAmount();

    //Rule
    public final void vehicleSalesCommissionAmount(double vehiclePrice){

        double commissionAmount;
        commissionAmount = vehiclePrice *0.08;
        String stringCommissionAmount =  String.format("Vehicle Commission Amount: %s", commissionAmount);
        System.out.println(stringCommissionAmount);

    }
}

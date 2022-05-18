package Abstraction;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicleCar = new Car();
        Vehicle vehicleBus = new Bus();
        vehicleCar.taxAmount();
        vehicleCar.vehicleSalesCommissionAmount(74000);

        vehicleBus.taxAmount();
        vehicleBus.vehicleSalesCommissionAmount(490000);

    }
}

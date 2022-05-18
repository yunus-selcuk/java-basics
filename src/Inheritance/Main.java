package Inheritance;

public class Main {
    public static void main(String[] args) {
     Car car = new Car();
     car.setVehicleDoors(4);
     car.setVehicleWheels(4);

        String stringCar = String.format("Car Info: number of doors, %s number of wheels %s ",car.getVehicleDoors(), car.getVehicleWheels());
        System.out.println(stringCar);

     Bus bus = new Bus();
     bus.setVehicleDoors(2);
     bus.setVehicleWheels(6);

        String stringBus = String.format("Bus Info: number of doors, %s number of wheels %s ",bus.getVehicleDoors(), bus.getVehicleWheels());
        System.out.println(stringBus);
    }
}

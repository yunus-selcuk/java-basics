package Polymorphism;

public class Main {
    public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    Car car = new Car();
    Bus bus = new Bus();

    vehicle.MaxSpeed();
    car.MaxSpeed(100);
    bus.MaxSpeed(100);


    }
}

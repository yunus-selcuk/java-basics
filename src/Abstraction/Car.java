package Abstraction;

public class Car extends Vehicle {

    @Override
    public void taxAmount() {
        System.out.println("Car tax amount ranges from %18 to %25 percent");
    }
}

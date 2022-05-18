package Abstraction;

public class Bus extends Vehicle {

    @Override
    public void taxAmount() {
        System.out.println("Bus tax amount ranges from %30 to %50 percent");
    }
}

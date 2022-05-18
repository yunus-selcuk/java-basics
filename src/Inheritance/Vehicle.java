package Inheritance;

public class Vehicle {
    private int vehicleDoors;
    private int vehicleWheels;

public void Info(){
    System.out.println("This is a vehicle");
}

    public int getVehicleDoors() {
        return vehicleDoors;
    }

    public void setVehicleDoors(int vehicleDoors) {
        this.vehicleDoors = vehicleDoors;
    }

    public int getVehicleWheels() {
        return vehicleWheels;
    }

    public void setVehicleWheels(int vehicleWheels) {
        this.vehicleWheels = vehicleWheels;
    }
}

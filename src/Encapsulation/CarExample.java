package Encapsulation;

public class CarExample {
    public static void main(String[] args) {
    CarProperties carProperties = new CarProperties();

        carProperties.setCarModelYear(1999);
        carProperties.setCarBrand("Opel");
        carProperties.setCarModel("Astra");

        String string = String.format("Car Info: %s %s %d ",carProperties.getCarBrand(), carProperties.getCarModel(), carProperties.getCarModelYear());
        System.out.println(string);
    }
}

package day32_Constructors;

public class CarObject {

    public static void main(String[] args) {


        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Toyota", "Camry", 2008);
        Car car4 = new Car("Toyota", "Camry", 2008, 9000);
        Car car5 = new Car("Toyota", "Camry", 2008, 9000, "Black");

    }
}
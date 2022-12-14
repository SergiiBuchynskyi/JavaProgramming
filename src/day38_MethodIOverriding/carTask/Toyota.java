package day38_MethodIOverriding.carTask;

public class Toyota extends Car {


    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void start(){
        System.out.println(brand + " " + model + " starts by twisting the key");
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

}

package day38_MethodIOverriding.carTask;

public class Tesla extends Car {
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " is in autopilot mode");
    }

    public void start(){
        System.out.println(brand + " " + model + " starts by saying \"Start\"");
    }


}

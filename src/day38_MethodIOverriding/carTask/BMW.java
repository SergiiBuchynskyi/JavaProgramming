package day38_MethodIOverriding.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
        public void beaksDown(){
            System.out.println(brand + " " + model + " is beaks down");
        }
        public void racing(){
            System.out.println(brand + " " + model + " is racing");
        }

}

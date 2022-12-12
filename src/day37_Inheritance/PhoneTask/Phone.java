package day37_Inheritance.PhoneTask;

public class Phone {

    public static boolean hasBattery = true;
    public String brand, model, size;
    public double price;
    public String color;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long proneNumber) {
        System.out.println(brand + " " + model + " is calling " + proneNumber);
    }

    public void text(long proneNumber) {
        System.out.println(brand + " " + model + " is texting " + proneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

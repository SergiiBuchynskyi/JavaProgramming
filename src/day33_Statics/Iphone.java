package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price = 123;

    public static String OS = "iOS";

    public String color, size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void main(String[] args) {
        System.out.println(OS);
    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    



}

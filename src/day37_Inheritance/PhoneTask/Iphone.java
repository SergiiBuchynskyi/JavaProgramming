package day37_Inheritance.PhoneTask;

public class Iphone extends Phone {



    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is having a FaceTime with phoneNumber: " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a FaceTime with email: " + email);
    }

}

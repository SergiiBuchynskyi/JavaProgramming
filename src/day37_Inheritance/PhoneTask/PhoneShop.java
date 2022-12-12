package day37_Inheritance.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone1  = new Iphone("12 Pro", "6.7", 1000, "Black");
        Samsung samsung1= new Samsung("Samsung", "galaxy s19", "6", 900, "White");
        Nokia nokia     = new Nokia("Brick", "4",110, "Gray");

        iphone1.faceTime(468468651);
        iphone1.faceTime("asd@asd.ewq");

        System.out.println(iphone1);

    }

}

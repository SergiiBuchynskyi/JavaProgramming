package day05_StringConcatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*...*/

        String  name = "Sergii Buchynskyi",
                buildingNumber = "17",
                streetName = "vul. Lugova",
                city = "Zhytomyr",
                state = "Zhytomyrska oblast",
                zipCode = "10007";

        /*...*/
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);
    }
}

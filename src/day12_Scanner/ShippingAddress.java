package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter building number");
        String building = input.next();
        input.nextLine();

        System.out.println("Enter street");
        String street = input.nextLine();

        System.out.println("City");
        String city = input.nextLine();

        System.out.println("State");
        String state = input.nextLine();

        System.out.println("Zip code");
        String zipcode = input.nextLine();
        input.close();

        System.out.println();
    }
}

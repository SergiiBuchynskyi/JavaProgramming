package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age");
        int age = input.nextInt();

        System.out.println("Enter gender");
        String gender = input.next();

        input.nextLine();
        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println("Enter phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter zip code");
        int zipCode = input.nextInt();

        input.nextLine();
        System.out.println("Enter school name");
        String schoolName = input.nextLine();

        System.out.println("Enter city name");
        String cityName = input.nextLine();

        System.out.println("Enter state name");
        String stateName = input.next();

        System.out.println("Enter building number");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("Enter street name");
        String streetName = input.nextLine();


        input.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t " + buildingNumber + " " + streetName +"\n\t"
        + cityName+ " " + stateName + " " + zipCode);
        System.out.println("School name " + schoolName);

    }
}

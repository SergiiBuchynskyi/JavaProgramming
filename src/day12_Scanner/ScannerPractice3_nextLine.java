package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your programming language");
        String programing = scan.nextLine();

        System.out.println("Enter your age: ");


        int age = scan.nextInt();
        System.out.println("Enter your school name: ");
        scan.nextLine();
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programing = " + programing);
        System.out.println("schoolName = " + schoolName);
        System.out.println("age = " + age);
        scan.close();
    }

}

package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First number");
            int num1 = scan.nextInt();
            System.out.println("Second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num2 + num1));

            System.out.println("Would you like to continue?Yes/no");
            String a = scan.next().toLowerCase();
            while (a.equals("yes") || a.equals("no")) {
                System.out.println("invalid");
                a = scan.next().toLowerCase();
                if (a.equals("no")) {
                    break;
                }
            }


        }


    }
}

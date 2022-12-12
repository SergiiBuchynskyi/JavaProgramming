package day18_NestedLoop;

import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String u = scan.nextLine();

        System.out.println("Enter password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Invalid");
                System.out.println("Attempt " + i);
                System.out.println("Enter username");
                u = scan.next();

                System.out.println("Enter password");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("Logged in");
                    break;
                }
            }
        }
        System.err.println("Your account locked");

    }
}

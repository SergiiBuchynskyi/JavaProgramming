package day17_While_DoWhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //Username - Cydeo
        //password - Cydeo123
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scan.next();
        System.out.println("Enter password: ");
        String password = scan.next();


        boolean isValid = username.equals("Cydeo") && password.equals("Cydeo123");
        if (isValid) {
            System.out.println("Welcome");
        } else {
            int attempt = 3;
            while (!isValid && attempt>0){
                System.out.println("Wrong");
                System.out.println("Enter username: ");
                username = scan.next();
                System.out.println("Enter password: ");
                password = scan.next();
                attempt--;
            }
            if (isValid ){
                System.out.println("Welcome");
            }else {
                System.out.println("Blocked");
            }
        }
    }

}




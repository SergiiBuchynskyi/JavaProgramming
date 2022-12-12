package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(" * ");
            }
        }
        //--------------------------
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");
            int a = scan.nextInt();
            if (a % 2 != 0) {
                System.out.println("odd");
            } else
                System.out.println("even");

            System.out.println("Would you like another number");
            String b = scan.next();
            while (!(b.equals("yes")|| b.equals("no"))){
                System.err.println("Invalid");
                b = scan.next();
            }

        }
    }
}
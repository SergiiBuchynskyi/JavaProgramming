package day19_LoopsWithOutCurlyBraces;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println("Enter a number:");
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.println("Would you like to enter another number(yes/no)");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.exit(0);
            }
            if (a.equalsIgnoreCase("no")) {
                break;


            }
        }
    }
}

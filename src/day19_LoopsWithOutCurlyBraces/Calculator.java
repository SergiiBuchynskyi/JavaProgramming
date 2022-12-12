package day19_LoopsWithOutCurlyBraces;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num1  = scan.nextInt();

        System.out.println("Enter operator");
        char operator = scan.next().charAt(0);
        if (!(operator == '+' || operator == '-')){
            System.err.println("Invalid");
            System.exit(0);
        }


        System.out.println("Enter number");
        int num2  = scan.nextInt();






    }
}

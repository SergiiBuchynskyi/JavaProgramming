package day15_ForLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int min = 2147483647;
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter a number");
                int input = scan.nextInt();
                if (input< min){
                    min = input;
                }

            }
            System.out.println(min);


    }
}

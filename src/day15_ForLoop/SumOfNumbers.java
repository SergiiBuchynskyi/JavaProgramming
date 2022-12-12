package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        double sum = 0;
        for (int i = 0; i < 101; i++) {
            System.out.println(sum +=i);
        }

        Scanner scan = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            System.out.println(total += scan.nextInt());
        }
    }
}

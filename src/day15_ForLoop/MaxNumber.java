package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        for (int i = 0; i <5; i++) {
            System.out.println("Enter a number");
            int input = scan.nextInt();
            if (input>max){
                max = input;
            }

        }
        System.out.println(max);


    }
}

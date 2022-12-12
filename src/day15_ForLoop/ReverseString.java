package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";

        for (int i = str.length()-1; i >= 0; --i) {
            System.out.print("" + str.charAt(i));
            result += "" + str.charAt(i);

        }
        System.out.println("\n Saved reversed string: " + result);


    }
}

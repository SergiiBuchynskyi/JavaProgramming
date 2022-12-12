package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        String result = "";
        if (a >= 1 && a <= 7) {
            result = (a == 1) ? "Monday" : (a == 2) ? "Tuesday" : (a == 3) ? "Wednesday"
                    : (a == 4) ? "Thursday" : (a == 5) ? "Friday" : (a == 6) ? "Saturday" : "Sunday";
        }else {
            System.out.println("Invalid number");
        }
        System.out.println(result);
        scanner.close();

    }
}

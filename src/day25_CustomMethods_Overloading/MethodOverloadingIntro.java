package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);
        double[] doubleArray = {5.5, 6.5, 0.5, -1.5, 3.5, 4.5};
        Arrays.sort(doubleArray);
        char[] charArray = {'D', 'w', 'g', '*'};
        Arrays.sort(charArray);


        sumOfNumbers(10,30,50,70);
        sumOfNumbers(1,5,5, 5.4);
    }


    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }


}

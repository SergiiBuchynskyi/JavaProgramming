package day20_Arrays;

import java.util.Arrays;

public class Array_Practice {
    public static void main(String[] args) {

        int[] num = {10, 20, 50, 70};
        System.out.println(Arrays.toString(num));

        int[] num1 = new int[5];
        num1[1] = 85;
        num1[num1.length - 1] = 95;
        num1[3] = 75;
        num1[0] = 65;
        num1[2] = 55;

        System.out.println(Arrays.toString(num1));


        String [] months = {"J","f",",m","a","m","June","July","Aug","Sep","oct","now","dec",};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        for (int i = months.length-1; i >= 0; i--) {
            System.out.println(months[i]);
        }










    }
}

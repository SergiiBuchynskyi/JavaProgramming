package day21_ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char c : chars) {
            System.out.println(c);
        }


    }
}

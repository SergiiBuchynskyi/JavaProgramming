package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String str = "I love Java";

        String [] words = str.split(" ");
        String reverse = "";

        for (int i = words[1].length()-1; i >= 0; i--) {
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);
        words[1] = reverse;
        System.out.println(Arrays.toString(words));
String result = "";
        for (String each:words) {
            result += each+" ";
        }
        System.out.println(result);
    }
}

package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Today is a good day to learn Java";
        String [] strWords = str.split(" ");

        String strReversed = "";
        for (int i = strWords.length-1; i >= 0; i--) {
            strReversed += strWords[i] + " ";
        }
        System.out.println(strReversed);


    }
}

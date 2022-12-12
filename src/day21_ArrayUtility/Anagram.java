package day21_ArrayUtility;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));


        //_________________________________________________

        String sentence = "Wooden Spoon";
        String [] str = sentence.split(" ");
        System.out.println(Arrays.toString(str));


        String s = "asldkjh. asldj kj lkasjd lkajsd la. asd. asd a";
        String sentence1 [] = s.split("\\. ");

        System.out.println(Arrays.toString(sentence1));


    }
}

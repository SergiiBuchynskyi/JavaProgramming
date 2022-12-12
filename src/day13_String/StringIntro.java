package day13_String;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String str = "java";// all the same
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        //---------------------

        String st  = new String("java"); // all different classes
        String st1 = new String("java");
        String st2 = new String("java");
        String st3 = new String("java");

        //---------------------

        Scanner scan = new Scanner(System.in);
        String s = "123";
        String s1 = scan.nextLine();
        System.out.println(s==s1);//false
        System.out.println(s.equals(s1));//true




    }
}

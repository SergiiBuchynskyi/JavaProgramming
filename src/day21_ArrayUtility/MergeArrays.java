package day21_ArrayUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        String [] group1 = {"Ali","Layan","Aysenur"};
        String [] group2 = {"Maria","Aygun"};

        String []students = new String[group1.length+group2.length];
        int i = 0;
        for (String s : group1) {
            students[i++] = s;
        }
        for (String s : group2) {
            students[i++] = s;
        }
        System.out.println(Arrays.toString(students));

        char []ch1 = {'A','B','C'};
        char []ch2 = {'D','E'};

        char [] chars = new char [ch1.length+ ch2.length];

        for (char c : ch1) {
            chars[i] = c;
            i++;
        }
        for (char c : ch2) {
            chars[i] = c;
            i++;
        }
        System.out.println(Arrays.toString(chars));
    }
}
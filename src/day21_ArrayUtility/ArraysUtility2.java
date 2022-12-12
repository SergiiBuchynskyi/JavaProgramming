package day21_ArrayUtility;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James"};
        String[] earlyBirds = Arrays.copyOf(students, 3);

        int []scores = {10,20,30,40,50,60,70,80,90,100};

        int []result = Arrays.copyOfRange(scores,3,7);




    }
}

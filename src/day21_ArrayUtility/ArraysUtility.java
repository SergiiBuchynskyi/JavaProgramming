package day21_ArrayUtility;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int []nums = {1,2,3,4,5};

        System.out.println(nums);
        // toString()
        System.out.println(Arrays.toString(nums));

        int []scores = {95,100,55,65,85,78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("min = " + scores[0]);
        System.out.println("max = " + scores[scores.length-1]);

        String names [] = {"Anna","Gunay","Zuhal","Ahmed","Maria","Sinema"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));



        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);


        char [] ch1 = {'a','b','c'};
        char [] ch2 = {'a','c','b'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(arr1,arr2);




    }
}

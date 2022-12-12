package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,5,5,5,5,5,5,5,1,1,11,1,1,1,1,1,1,11,1,};
        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] removeDuplicates (int []array){

        int [] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }return result;

    }


}

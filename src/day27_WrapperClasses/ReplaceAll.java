package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 5};
        arr = replaceAll(arr, 5, 5555);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] replaceAll(int []array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }return array;
    }

}

package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,5848};
        int []result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[]reverse(int[]array){
        int []result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
            result[j] = array[i];
        }return result;
    }
}

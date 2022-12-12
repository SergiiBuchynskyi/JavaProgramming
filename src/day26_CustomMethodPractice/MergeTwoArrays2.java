package day26_CustomMethodPractice;
import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {

        String []str1 = {"AB","B","D"};
        String []str2 = {"f","r","t"};
        String []str3 = ArraysUtility.merge(str1,str2);
        System.out.println(Arrays.toString(str3));
    }

    public static int []merge (int[]arr1, int[]arr2){
        int[]result = {};

        for (int each : arr1) {
            ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            ArraysUtility.addElement(result,each);
        }
        return result;
    }
}

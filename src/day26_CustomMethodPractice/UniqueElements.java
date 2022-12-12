package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 34, 4, 45, 54, 78, 0};
        int[] unique = ArraysUtility.uniqueElements(arr);
        System.out.println(Arrays.toString(unique));

        double[] arr2 = {2.5, 2.5, 8.5, 4.5, 2.5, 5.5,};
        double[] unique2 = ArraysUtility.uniqueElements(arr2);
        System.out.println(Arrays.toString(unique));

    }

    public static int[] UniqueElements(int[] array) {


        int[] result = {};

        for (int each : array) {


            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                ArraysUtility.addElement(result, each);

            }
        }
        return result;
    }
}

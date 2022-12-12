package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //print each element of array
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //max value of array
    public static int maxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double maxValue(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //min value of array
    public static int minValue(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static double minValue(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //check if given integer is contained in the given array.
    //returns boolean. contains(int[],int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    // add given element to Array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //frequency of the element in Array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }

        return count;
    }

    //Unique Elements in Array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removeTester element from Array
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            {

            }
            result[j++] = array[i];
        }
        return result;
    }

    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            {

            }
            result[j++] = array[i];
        }
        return result;
    }

    public static char[] removeElement(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            {

            }
            result[j++] = array[i];
        }
        return result;
    }

    public static String[] removeElement(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            {

            }
            result[j++] = array[i];
        }
        return result;
    }


    //merge 2 Arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char each : arr1) {
            result =  ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //reverses the given Array
    public static int[]reverse(int[]array){
        int [] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }return result;
    }
    public static double[]reverse(double[]array){
        double [] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }return result;
    }
    public static char[]reverse(char[]array){
        char [] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }return result;
    }
    public static String[]reverse(String[]array){
        String [] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }return result;
    }


    //replace value in Array by index
    public static int [] replace (int[]array, int index, int newElement){
        if (!(index >= 0 && index < array.length)) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static double [] replace (double[]array, int index, double newElement){
        if (!(index >= 0 && index < array.length)) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static char [] replace (char[]array, int index, char newElement){
        if (!(index >= 0 && index < array.length)) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static String [] replace (String[]array, int index, String newElement){
        if (!(index >= 0 && index < array.length)) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replaces all matching values of the array with new value
    public static int [] replaceAll(int []array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }return array;
    }
    public static double [] replaceAll(double []array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }return array;
    }
    public static char [] replaceAll(char []array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }return array;
    }
    public static String [] replaceAll(String []array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }return array;
    }


    // removes duplicate from the array
    public static int[] removeDuplicates (int []array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        } return result;
    }
    public static double[] removeDuplicates (double []array) {

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        } return result;
    }
    public static char[] removeDuplicates (char []array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        } return result;
    }
    public static String[] removeDuplicates (String []array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result = ArraysUtility.addElement(result, each);
            }
        } return result;
    }
    
    
    
    





}







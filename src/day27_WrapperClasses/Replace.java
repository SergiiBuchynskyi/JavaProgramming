package day27_WrapperClasses;
import utilities.ArraysUtility;
import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = ArraysUtility.replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

        String[] str = {"asd", "asd", "asd", "asd"};
        str = ArraysUtility.replace(str, 1, "123");
        System.out.println(Arrays.toString(str));
    }

}
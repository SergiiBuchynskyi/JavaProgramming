package day27_WrapperClasses;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
int []arr = {1,3,12,5,24,7,9,10};
boolean[]barr = new boolean[arr.length];

        for (int i = arr.length-1; i >-1; i--) {
            if (arr[i]%2==0){
                barr[arr.length-1-i]= true;
            }
        }
        System.out.println(Arrays.toString(barr));
    }
}


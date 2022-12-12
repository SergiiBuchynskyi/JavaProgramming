package day24_CustomerMethodReturn;

import java.util.Arrays;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int [] a= {1,4,2,42,42,4,24,24,24,24,123123,5,435325,3245};
int maxNumber = maxNumber(a);
        System.out.println(maxNumber);
    }

    public static int maxNumber (int [] numbers){
        Arrays.sort(numbers);
        int maxNumber = numbers[numbers.length-1];
        return maxNumber;
    }

}

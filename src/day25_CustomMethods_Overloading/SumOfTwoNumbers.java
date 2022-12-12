package day25_CustomMethods_Overloading;

public class SumOfTwoNumbers {
    public static void main(String[] args) {





int sum2 = sumOfTwo(10,20);
int sum3 = sumOfThree(10, 20, 30);
int sum4 = sumOfFour(10,20,30,40);
    }

    public static int sumOfTwo(int num1, int num2) {
        return num1 + num2;
    }
    public static int sumOfThree(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int sumOfFour(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }



}

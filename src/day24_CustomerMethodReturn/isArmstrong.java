package day24_CustomerMethodReturn;

public class isArmstrong {
    public static void main(String[] args) {
        isArmstrong(1634);
    }

    public static void isArmstrong(int num) {

        int sum = 0;
        int tempNum = num;
        int length = (num + "").length();
        int[] temp = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            temp[i] = num % 10;
            num /= 10;
            int result = 1;
            for (int power = length; power != 0; power--) {
                result = result*temp[i];
            }
            sum +=result;
        }


        System.out.println(sum == tempNum ? "true" : "false");

    }

}
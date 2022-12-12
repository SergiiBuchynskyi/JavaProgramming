package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "CLdeo1990@";

        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecialChar = 0;


        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)) {
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            } else {
                countSpecialChar++;
            }
        }
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigit = " + countDigit);
        System.out.println("countLower = " + countLower);
        System.out.println("countUpper = " + countUpper);

        boolean hasUpper = countUpper > 0;
        boolean hasLower = countLower > 0;
        boolean hasDigit = countDigit > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

        boolean isStrongPassword = password.length() >= 8 && !password.contains(" ") &&
                hasUpper&&hasLower&&hasSpecialChar&&hasDigit;


    }


/*
    public static boolean isStrongPassword(String password) {

        return isStrongPassword;
    }
*/

}

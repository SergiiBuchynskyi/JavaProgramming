package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo1  23(*&%";
        String digits = "";
        String specialCharacters = "";
        String letters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >='0' && ch<='9'){
                digits += ch;
            } else if (ch>='A' && ch<='Z') {
                letters += ch;
            } else if (ch>='a' && ch<='z') {
                letters += ch;
            }else {
                if (ch != ' '){
                specialCharacters += ch;
            }
            }



        }
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);
        System.out.println("digits = " + digits);







    }
}

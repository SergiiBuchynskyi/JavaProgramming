package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char trirdChar = word.charAt(2);
        System.out.println("trirdChar = " + trirdChar);

        char tenthChar = word.charAt(1);
        System.out.println("tenthChar = " + tenthChar);

        System.out.println(word.length());

        word = word.toUpperCase(); // CYDEO
        System.out.println(word);


    }
}

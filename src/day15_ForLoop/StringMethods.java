package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "    ";
        String str = " ";

        str.isEmpty(); // no symbols
        str.isBlank(); // no symbols but could hava whitespaces
        str.equals(str1);// strings ==
        str.equalsIgnoreCase(str1); // string == , but ignorCase
        str.startsWith(" ");
        str.endsWith(" ");
        str.contains(" ");
        str.toLowerCase().contains(" ");

    }
}
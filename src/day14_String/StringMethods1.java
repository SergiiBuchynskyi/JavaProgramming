package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        // .trim - cuts whitespaces from both sides
        String str1 = "      batch        ";
        str1 = str1.trim();
        System.out.println(str1);

        // index
        String str2 = "Cydeo School";
        int n1 = str2.indexOf("o"); // return index of first char found
        int n2 = str2.indexOf("ool");
        System.out.println(n1);
        System.out.println(n2);

        String str3 = "Java is programming language";
        str3.indexOf("gua");// last "g"
        str3.lastIndexOf("g");// or like this last "g"


        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a N");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);



    }
}

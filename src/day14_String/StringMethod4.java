package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Cydeo\n";
        System.out.println(str.repeat(3));

// isEmpty isBlank
        String str1 = "     ";
        System.out.println(str1.isEmpty());// isEmpty
        System.out.println(str1.isBlank());// isBlank (ignor whitespace)

        //.equals
        String str2 = "Java";
        String str3 = new String("Java");
        System.out.println(str2 == str3);//false
        System.out.println(str2.equals(str3));//true

//equalsIgnoreCase
        String str4 = "JAVA";
        String str5 = "Java";
        System.out.println(str4.equalsIgnoreCase(str5));// true

        //startsWith
        String str6 = "Wooden Spoon";
        boolean result1 = str6.startsWith("Wood");//true
        System.out.println("result1 = " + result1);

        //endsWith
        boolean result2 = str6.endsWith("poon");//true
        System.out.println("result2 = " + result2);



    }
}

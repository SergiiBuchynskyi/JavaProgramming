package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        // replace (oldVal, newVal)

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        String sentence = "Java Python Java Python Python Python c# c#";
        sentence.replace("Python ", "");


        // replace first (oldVal, newVal) ONLY the first
        String result = "Java Java Java";
        result = result.replace("Java", "C#");
        System.out.println("result = " + result);
        result = result.replaceFirst("C#", "Python");
        System.out.println("result = " + result);


    }
}

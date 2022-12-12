package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        // substring (beginning index, end index)

        String word = "Cydeo school";
        //             0123456789..
        word = word.substring(0, 5);// Cydeo school --> Cydeo
        System.out.println("word = " + word);

        String word2 = "Python C# Ruby";

        String s1 = word2.substring(0, word2.indexOf(" "));

        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}

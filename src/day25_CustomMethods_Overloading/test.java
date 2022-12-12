package day25_CustomMethods_Overloading;
import utilities.StringUtility;
public class test {
    public static void main(String[] args) {
        String str = "qwerty";
        StringUtility.printEachChar(str);


        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);


        String s2 = "Civic";
        boolean isPal = utilities.StringUtility.isPalindrome(s2);
        System.out.println(isPal);


        String [] names = {"Anna","Java","Python","racecar","Mom"};

        int count = 0;
        for (String name : names) {
            if (StringUtility.isPalindrome(name)){
                count++;
            }
        }
        System.out.println(count);


        String str1 = "aaaaaaaaaavvvvvvbbbbbbbb";

        str1 = utilities.StringUtility.removeDuplicates(str1);
        System.out.println(str1);



    }
}

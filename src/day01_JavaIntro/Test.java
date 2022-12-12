package day01_JavaIntro;
import day24_CustomerMethodReturn.ReturnMethodPractice4;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "aaaabbbbbdddddcccc";

        System.out.println(ReturnMethodPractice4.removeDublicates(str));


        StringUtility.printEachChar(str);

    }
}

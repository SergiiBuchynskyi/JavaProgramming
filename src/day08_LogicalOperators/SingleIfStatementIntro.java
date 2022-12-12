package day08_LogicalOperators;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 300;
        if (number % 2 == 0){
            System.out.println(number + " is even number");
    }
        if (number % 2 != 0){
            System.out.println(number + " not even number");
        }

        //_________________
        int n = 200;
        //positive
        if (n>0){
            System.out.println(n + " is positive");
        }
        //negative
        if (n < 0){
            System.out.println(n + " is negative");
        }
        // zero
        if (n == 0){
            System.out.println(n + " is zero");
        }



}
}
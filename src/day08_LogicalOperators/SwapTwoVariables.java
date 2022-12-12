package day08_LogicalOperators;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //with TEMP variable
        int c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);

        //without TEMP variable
        a = a + b;     //
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}

package day07_Operators;

public class UnuryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -25;
        System.out.println(num1<0);//false
        System.out.println(num2<0);//true

        int a = 5;
        ++a;
        System.out.println(a);//increases the value by one
        --a;
        System.out.println(a);//decreases the value by one

        int b = 100;
        System.out.println(++b);//pre increment: increases the value by 1 right away

        int c = 100;
        System.out.println(c++);// post increment: increases the value by 1 the next step
        System.out.println(c);

        int x = 200;
        System.out.println(--x);//pre decrement: decreases the value by 1 right away
        System.out.println(x--);//post decrement: decreases the value by 1 the next step
        System.out.println(x);

        int t = 1;
        System.out.println(1+(++t));
        System.out.println(1+(t++));
        System.out.println(1+(t++));
        System.out.println(t);
    }
}

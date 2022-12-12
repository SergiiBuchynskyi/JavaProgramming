package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment: =
        int number = 100;
        System.out.println("number = " + number);
        number = 200;
        System.out.println("number = " + number);

        String word = "Java Programming";
        System.out.println("word = " + word);
        word = "Wooden Spoon";
        System.out.println("word = " + word);

        //addition assignment
        int x = 100;
        System.out.println("x = " + x);
        x +=200;
        System.out.println("x = " + x);


        double num1 = 2.5;
        System.out.println("num1 = " + num1);

        num1+=5.5;
        System.out.println("num1 = " + num1);

        double avaibleBalance = 100.50;

        // deposit 300$
        avaibleBalance+=300;
        System.out.println("avaibleBalance = " + avaibleBalance);
        avaibleBalance-=500;
        System.out.println("avaibleBalance = " + avaibleBalance);
        avaibleBalance-=200+400;
        avaibleBalance+=400;
        System.out.println("avaibleBalance = " + avaibleBalance);

        //multiplication
        double salary = 50000.50;
        salary *=2;

        //
        double num2 = 25000;
        num2/=2;
        System.out.println("num2 = " + num2);

        int amount = 127; //cents
        int quarters = amount/25;
        int cents = amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int y = 300;
        y%=16;
        System.out.println("y = " + y);

        int balance = 3500;
        balance %=153;
        // insurance fee: $153
        System.out.println("balance = " + balance);


    }
}

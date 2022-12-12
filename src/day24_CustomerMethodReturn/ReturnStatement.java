package day24_CustomerMethodReturn;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(1);
    }

    public static void nameOfDay(int number) {
        if (number < 1 || number > 7) {
            System.out.println("Invalid");
            return; //exits method
        }
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wed");
        } else if (number == 4) {
            System.out.println("Thur");
        } else if (number == 5) {
            System.out.println("Fri");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }
}

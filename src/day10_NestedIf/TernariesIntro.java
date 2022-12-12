package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;
        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        String result1 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);

        int number = 100;
        if (number>0){
            System.out.println("Possitive");
        }else if (number<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        String result3 = (number>0)? "Possitive" : (number<0)? "Negative" : "Zero";
        System.out.println(result3);
    }
}

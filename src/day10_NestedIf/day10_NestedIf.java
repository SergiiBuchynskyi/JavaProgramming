package day10_NestedIf;

public class day10_NestedIf {
    public static void main(String[] args) {
        int score = 60;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid score");
        }
        int age = 25;
        boolean hasId = true;
        if (hasId) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }


        } else {
            System.out.println("Must have ID!");
        }

        int number = 7;
        if (number >=1 && number<=7){
            if (number == 1){
                System.out.println("Monday");
            }else if (number == 2){
                System.out.println("Tuesday");
            }else if (number == 3){
                System.out.println("Wednesday");
            }else if (number == 4){
                System.out.println("Thursday");
            }else if (number == 5){
                System.out.println("Friday");
            }else if (number == 6){
                System.out.println("Saturday");
            }else if (number == 7){
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Invalid number");
        }


    }
}


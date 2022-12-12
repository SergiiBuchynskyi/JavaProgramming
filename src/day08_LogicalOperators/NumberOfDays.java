package day08_LogicalOperators;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 1;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;


        if (has28Days) {
            System.out.println("28");
        }
            if (has30Days) {
                System.out.println("30");
            }
                if (!has28Days && !has30Days){
                    System.out.println("31");
            }
        }
    }


package day08_LogicalOperators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        if (year%4==0){
            System.out.println(year + " is leap");
        }
        else {
            System.out.println(year + " in not leap");
        }
    }
}

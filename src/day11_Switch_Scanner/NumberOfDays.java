package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int n = 9;
String result = "";
        if (n>=1 && n <=12){
            switch (n){
                case 2:
                    if (year % 4 ==0){
                    result = "28 days";
                    }else {
                        result = "29 days";
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";

            }
        }else {
            result = "Invalid number";

        }
    }
}

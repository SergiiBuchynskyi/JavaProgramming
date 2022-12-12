package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        String result = "";
        switch (grade){
            case 'A':
                result = "Exelent";
                break;
            case 'B':
                result = "Great";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'E':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }
    }
}

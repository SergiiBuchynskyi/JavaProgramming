package day08_LogicalOperators;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 5;
        //String day;
        if (n == 1) {
            System.out.println("Monday");
            //day == "M"
        } else if (n == 2) {
            System.out.println("Thusday");
            //day == "Test"
        } else if (n == 3) {
            System.out.println("Wednesday");
            //day == "W"
        } else if (n == 4) {
            System.out.println("Thusday");
            //day == "Th"
        } else if (n == 5) {
            System.out.println("Friday");
            //day == "Fr"
        } else if (n == 6) {
            System.out.println("Saturday");
            //day == "Sat"
        } else {
            System.out.println("Sunday");
            //day == "Sun"
        }
        //System.out.println(day);
        String result = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" :
                (n == 3) ? "Wednesday" : (n == 4) ? "Thursday" : (n == 5) ? "Friday" :
                        (n == 6) ? "Saturday" : "Sunday";
    }
}

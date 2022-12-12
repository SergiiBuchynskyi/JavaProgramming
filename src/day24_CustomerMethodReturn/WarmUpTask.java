package day24_CustomerMethodReturn;

public class WarmUpTask {
    public static void main(String[] args) {
        initials("Wooden", "Spoon");

        //====================
        domain("ASCaskljd@gmail.com");

        String[] emails = {"asd@gmail.com", "asdy211@hotmail.com", "asd23adjskl@yahoo.com"};
        for (String each : emails) {
            domain(each);
        }
        //======================
        nameOfMonth(12);

        //=====================



    }

    // initials
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initial);
    }

    // domain
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    // month name
    public static void nameOfMonth(int num) {
        String name = "";
        if (num >= 1 && num <= 12) {
            name = (num == 1) ? "Jan" : (num == 2) ? "Feb" : (num == 3) ? "Mar" : (num == 4) ? "Apr" : (num == 5) ? "May" :
                    (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "Sep" : (num == 10) ? "Oct" :
                            (num == 11) ? "Nov" : "Dec";
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Month name = " + name);
    }

    //day name
    public static void nameOfDay(int num) {
        String name = "";
        if (num >= 1 && num <= 7) {
            name = (num == 1) ? "mon" : (num == 2) ? "tue" : (num == 3) ? "wed" : (num == 4) ? "thu" : (num == 5) ? "fri" :
                    (num == 6) ? "sut" : "sun";
        } else {
            System.out.println("Invalid");
        }
        System.out.println(name);
    }
        //how many days month has
     public static void howManyDays (int num){

     }



}

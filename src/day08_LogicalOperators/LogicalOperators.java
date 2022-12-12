package day08_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "UK";
        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote: " + isEligible);

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 80000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >=60000;
        System.out.println((name2 + " is eligible to vote: " + isEligible2));

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible to vote: " + isEligible3);

     String student = "Anna";
     double gpa = 3.5;
     int familyIncome = 100000;

     boolean isEligible4 = gpa >= 3.5 || familyIncome <= 60000;
     System.out.println(student + " is eligible to vote: " + isEligible4);

     int score = 55;
     boolean passed = score >=80;
     boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

            }
}

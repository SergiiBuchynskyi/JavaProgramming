package day05_StringConcatenation;

public class FullName {
    public static void main(String[] args) {
        String name = "Sergii";
        String surname = "Buchynskyi";
        int age = 34;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 1000000.58;
        String fullname = name + " " + surname;
        System.out.println("Fullname of the person is " + fullname);
        System.out.println(fullname + "is " + age + " years old");
        System.out.println(fullname + " is " + jobTitle + ", works at "
                + companyName + " and " + fullname + " salary is $" +salary);
    }
}

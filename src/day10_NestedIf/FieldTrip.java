package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        String location = "";
        int groupNumber = 0;
        String nameOfTeacher = "";
        int grade = 2;
        if (grade >= 0 && grade <= 6) {
            if (grade == 1) {
location="Apple orchard";
groupNumber = 3;
nameOfTeacher = "Ms.Smith";
            }else if (grade == 2) {
location="Zoo";
groupNumber = 7;
nameOfTeacher = "Mr.Lee";
            }else if (grade == 3) {
location="Aquarium";
groupNumber = 5;
nameOfTeacher = "Mr. Wilson";
            }else if (grade == 4) {
location="Apple orchard";
groupNumber = 3;
nameOfTeacher = "Ms.Smith";
            }else if (grade == 5) {
location="Apple orchard";
groupNumber = 3;
nameOfTeacher = "Ms.Smith";
            }else if (grade == 6) {
location="Apple orchard";
groupNumber = 3;
nameOfTeacher = "Ms.Smith";
            }
            System.out.println("location - " + location);
            System.out.println("number of groups - " + groupNumber);
            System.out.println("teacher in charge - " + nameOfTeacher);
        } else {
            System.out.println("Invalid grade");
        }
    }

}

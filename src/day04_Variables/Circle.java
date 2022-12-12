package day04_Variables;
//3. Create a class named Circle, write a program that can calculate
//the area & perimeter of any given Circle
//PI, radius, diameter, area, perimeter
//Hints: PI = 3.14
//area =
//radius * radius * PI
//Perimeter =
//2 * radius * PI
public class Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius = 3.5;
        double diameter = radius*radius*pi;
        double area = diameter*pi;
        double perimeter = diameter * pi;
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);

    }
}

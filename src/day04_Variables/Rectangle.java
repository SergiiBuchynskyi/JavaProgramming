package day04_Variables;

//2. Create a class named Rectangle, write a program that can
//calculate the area & perimeter of any given Rectangle
//length
//width
//area = length *
//width
//perimeter =  2 *
//(length + width)

public class Rectangle {
    public static void main(String[] args) {
        double length = 10;
        double width = 5;
        double area = length * width;
        double perimeter = 2*(length+width);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("width = " + width);
        System.out.println("length = " + length);
    }
}

package day04_Variables;
//1. Create a class named Square, write a program that can calculate
//the area & perimeter of any given square
//side
//area = side *
//side;
//perimeter = 4 *
//side
public class Square {
    public static void main(String[] args) {
        double side = 3.5;
        double square = side * side;
        double perimeter = side * 4;
        System.out.println(square);
        System.out.println(perimeter);
    }
}

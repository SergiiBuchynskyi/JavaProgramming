package day34_GarbageCollection;

import java.util.ArrayList;

public class Circle {

    public double radius;

    public static String name = "Circle";
    public static ArrayList<Integer> numbers;



    public Circle(double radius){
        this.radius = radius;
       // pi = 3.14;

    }
    static {
        double pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


    }

}

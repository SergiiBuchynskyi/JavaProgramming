package day39_Recap;

public class ShapeObject {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.setSide(20);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(2,5);
        rectangle.area();
        rectangle.perimeter();
        System.out.println(rectangle);

        Circle circle = new Circle(43);

        System.out.println(circle);



    }

}

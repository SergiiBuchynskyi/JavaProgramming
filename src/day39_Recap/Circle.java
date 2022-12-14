package day39_Recap;

public class Circle extends Shape{
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
      return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


}

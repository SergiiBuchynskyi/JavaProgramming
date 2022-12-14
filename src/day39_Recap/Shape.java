package day39_Recap;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }


    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public Shape(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

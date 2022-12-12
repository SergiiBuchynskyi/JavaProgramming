package day37_Inheritance.HomeWorkCandies;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Invalid quantity");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        if (price < 0) {
            System.out.println("Invalid price");;
        }
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Invalid price");
        } else {
            this.price = price;
        }
    }
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }
    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price == 0) ? "Free" : price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}

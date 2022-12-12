package day37_Inheritance.CryptoToken;

public class CryptoToken {

    public double price;
    public int quantity, marketCap, volume, circulatingSupply;
    public boolean isMineable;

    public CryptoToken(double price, int quantity, int marketCap, int volume, int circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

    public double totalPrice(double price, int quantity) {
        double totalPrice = price*quantity;
        return totalPrice;
    }
}




package day37_Inheritance.CryptoToken;

public class Doge extends CryptoToken{

    public Doge(double price, int quantity, int marketCap, int volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}

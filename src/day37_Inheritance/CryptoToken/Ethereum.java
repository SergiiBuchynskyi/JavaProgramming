package day37_Inheritance.CryptoToken;

public class Ethereum extends CryptoToken{


    public Ethereum(double price, int quantity, int marketCap, int volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}

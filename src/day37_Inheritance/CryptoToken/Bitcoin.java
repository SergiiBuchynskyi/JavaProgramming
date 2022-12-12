package day37_Inheritance.CryptoToken;

public class Bitcoin extends CryptoToken {

    public Bitcoin(double price, int quantity, int marketCap, int volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}

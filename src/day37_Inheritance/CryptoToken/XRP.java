package day37_Inheritance.CryptoToken;

public class XRP extends CryptoToken{

    public XRP(double price, int quantity, int marketCap, int volume, int circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}

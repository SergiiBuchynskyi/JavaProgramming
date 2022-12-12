package day37_Inheritance.CryptoToken;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin(14798, 4, 123, 123, 123, true);
        Cardano cardano = new Cardano(125, 1545, 123, 123, 123, false);
        Doge doge = new Doge(1231, 42, 123, 123, 123, false);
        Ethereum ethereum = new Ethereum(3412, 2, 123, 123, 123, true);
        XRP xrp = new XRP(321, 4212, 123, 123, 123, true);

        CryptoToken[] cryptoTokens = {bitcoin, cardano, doge, ethereum, xrp};

        double totalAssets = 0;
        for (CryptoToken cryptoToken : cryptoTokens) {
            totalAssets += cryptoToken.totalPrice(cryptoToken.price, cryptoToken.quantity);
            System.out.println(cryptoToken.totalPrice(cryptoToken.price, cryptoToken.quantity));

        }
        System.out.println("totalAssets = " + totalAssets);


    }

}

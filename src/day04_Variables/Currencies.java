package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar * 9.53;
        double euro = dollar * 1.16;
        //jpy, pound, peso, cad, riyal
        double jpy = dollar * 142.50;
        double pound = dollar * 0.86;
        double peso = dollar * 19.89;
        double cad = dollar * 1.30;
        double riyal = dollar * 3.76;
        System.out.println("riyal = " + riyal);
        System.out.println("cad = " + cad);
        System.out.println("peso = " + peso);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("riyal = " + riyal);
    }
}

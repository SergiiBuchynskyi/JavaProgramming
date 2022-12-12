package day17_While_DoWhileLoops;

public class FrequencyOfWord_byWhileLoop {
    public static void main(String[] args) {
        String str = "asdJavaasd Javaasdl;aksdfhls;kadfjlskajdfaslkfjdsa;lfkdsjafl;ksadjfl;askjdflsak;jfla;sdkfjasld;kfjasJava";
        int freq = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            freq++;
        }

        System.out.println(freq);
    }
}

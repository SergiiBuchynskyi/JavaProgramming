package day17_While_DoWhileLoops;

public class FrequencyOfWord_bySubstring {
    public static void main(String[] args) {
        String str = "asdJavaasd Javaasd";
        int freq = 0;
        for (int i = 0; i < str.length()-4; i++) {

                if (str.substring(i, i + 4).equals("Java")) {
                    freq++;
                }
            }

        System.out.println(freq);
    }
}
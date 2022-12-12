package day17_While_DoWhileLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAAAAAAADASDSASSSSS";
        int freq = 0;
        char ch = 'D';

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                freq += 1;
            }


        }
        System.out.println(freq);


    }
}

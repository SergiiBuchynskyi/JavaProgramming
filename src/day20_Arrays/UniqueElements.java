package day20_Arrays;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = {"Java", "Python", "C#", "Python", "Python"};

        int count = 0;
        String element = words[0];
        for (int j = 0; j < words.length; j++) {
            element = words[j];
            count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(element);
            }

        }


    }
}

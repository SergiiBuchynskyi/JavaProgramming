package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();

        if (word.indexOf('x') == 0){
            word = word.replaceFirst("x","a");
        }
        System.out.println(word);
// same
        if (word.charAt(0) == 'x'){
            word = word.replaceFirst("x","a");
        }
        System.out.println(word);




    }
}

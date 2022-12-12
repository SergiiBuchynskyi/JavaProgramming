package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        char ch = 'A';
        for (int i = 65; i <= 90; i++){
            System.out.print((ch = (char) i) + " ");

        }

        for (char j = 'A'; j<='Z'; j++) {
            System.out.print(j + " ");
        }


    }
}

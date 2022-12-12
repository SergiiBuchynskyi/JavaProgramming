package day23_CustomMethods_Void;

public class CustomMethodPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        oddOrEven(2);
        age(1945);
num(1,7);

    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("odd");
        } else
            System.out.println("even");
    }

    public static void age(int birthYear) {
        System.out.println(2022 - birthYear);
    }
public static void num(int x, int y){
        for ( int i = x+1; i < y; i++){
            System.out.println(i);
        }
}

}

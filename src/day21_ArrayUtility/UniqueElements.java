package day21_ArrayUtility;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam"};


        for (String each : words) {
            int count = 0;

            for (String element : words) {
                if (element.equals(each)) {
                    count++;
                }


            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}

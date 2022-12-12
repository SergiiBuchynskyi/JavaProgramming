package day21_ArrayUtility;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String []words = {"Java","Cydeo","Wooden","Early","Angry"};

        for (String word : words) {
            System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));
        }


    }
}

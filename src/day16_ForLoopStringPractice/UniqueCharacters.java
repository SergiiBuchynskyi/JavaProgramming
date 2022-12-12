package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaaaaBccccc";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i));
            if (isUnique){
                result += str.charAt(i);
            }

        }
        System.out.println(result);
    }
}

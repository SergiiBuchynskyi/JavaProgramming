package day21_ArrayUtility;

public class ReversedNames {
    public static void main(String[] args) {

        String [] names = {"123 123","asd asd","dsad as","dqwdwq wqdqw","gfeqwfwe fwefew","khjads adsl","kas; ; kl"};

        for (String name : names) {
            String reversed ="";

            for (int i=name.length()-1; i>=0; i--){
                reversed +=name.charAt(i);
            }
            System.out.println(reversed);
        }


    }
}

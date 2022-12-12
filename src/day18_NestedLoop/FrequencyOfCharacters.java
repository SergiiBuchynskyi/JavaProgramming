package day18_NestedLoop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "qwe";
        String result = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);


            for (int j = 0; j < str.length(); j++) {
                if (result.contains(ch + "")) {
                    continue;}
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

                }

            result += ch;
            result += count;


            }

        System.out.println(result);
        }



    }


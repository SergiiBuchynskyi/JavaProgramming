package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ryby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);


        ArrayList<String> unique = new ArrayList<>();

        for (String s : list) {
            if (list.indexOf(s) == list.lastIndexOf(s)){
                unique.add(s);
            }
        }

        System.out.println(unique);

        System.out.println(list.contains(12));











    }

}

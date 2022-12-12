package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Character>list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('a','b'));
        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.swap(list1,0,1);
        System.out.println(list1);

        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,10,20,20,30,30,30,10,10,10,10,10,10));

        Collections.replaceAll(list2, 10,777);
        System.out.println(list2);

       int freq = Collections.frequency(list2,777);
        System.out.println(freq);

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");




    }
}

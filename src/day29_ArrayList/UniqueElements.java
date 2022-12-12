package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 5, 5, 8, 7, 4, 4));
        ArrayList<Integer>unique = new ArrayList<>();

        for (Integer integer : list) {
            int freq = Collections.frequency(list,integer);
            if(freq==1){
                unique.add(integer);
            }
        }
        System.out.println(unique);

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 5, 5, 8, 7, 4, 4));

        ArrayList<Integer> unique2 =list1;
        unique2.removeIf(p -> Collections.frequency(list1, p)>1);
        System.out.println(unique2);


    }
}

package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(400);
        list.add(500);

        list.remove((Integer) 300);
        System.out.println(list);
/*
        list.clear();
        System.out.println(list);
*/
        System.out.println(list.indexOf(300));




    }
}

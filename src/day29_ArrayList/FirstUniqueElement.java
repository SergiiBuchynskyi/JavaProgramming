package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);


        System.out.println(unique(list));
    }

    public static int unique(ArrayList<Integer> list) {


        int unique = 0;
        for (Integer element : list) {
            int count = 0;
            for (Integer each : list) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                unique = element;
            }

        }
        return unique;
    }
}


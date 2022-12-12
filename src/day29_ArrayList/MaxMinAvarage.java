package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAvarage {
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


        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;


        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
            if (integer<max){
                min = integer;
            }
            sum+=integer;
        }

        double avarage = (double) sum / list.size();

        System.out.println(max + " " + min + " " + avarage);
    }
}

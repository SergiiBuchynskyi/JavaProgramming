package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,4,5,6,7,8,9,10));
        list.removeAll(Arrays.asList(3,4,7,100));
        System.out.println(list);

        list.retainAll(Arrays.asList(1,10));
        System.out.println(list);

        ArrayList<String>jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2)&&nums.contains(5)&& nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));



        String[]names = {"Josh","Jack","Daniel","Shay","Breanna"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);


        int[]arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>();
        list3 = convertArrayToArrayList(arr2);
        System.out.println(list3);
}

public static ArrayList<Integer> convertArrayToArrayList(int[]array){
        ArrayList<Integer>list = new ArrayList<>();

    for (int each : array) {
        list.add(each);
    }return list;
}
}
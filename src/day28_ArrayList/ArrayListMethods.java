package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(123);
        numbers.add(123);
        System.out.println("numbers = " + numbers);

        numbers.add(2,777);
        numbers.add(2,555);
        System.out.println("numbers = " + numbers);


        System.out.println(numbers.size());


        int lastIndex = numbers.size()-1;

        Integer num = numbers.get(3);
        int num1 = numbers.get(3);
        System.out.println(num);
        System.out.println(num1);

        numbers.set(3,666);
        System.out.println(numbers);

        ArrayList<String>list =  new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");

        System.out.println(list);
        list.set(3,"C#");




    }
}

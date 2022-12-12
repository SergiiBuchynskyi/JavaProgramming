package day37_Inheritance.HomeWorkCandies;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

    Candy candy1 = new Candy("Svitoch", 48, 0, false);
    Candy candy2 = new Candy("Snickers", 23, -4, true);
    Candy candy3 = new Candy("M&Ms", 105, 8, true);
    Candy candy4 = new Candy("Milka", 15, 3.53, true);
    Candy candy5 = new Candy("Korivka", 44, 7, false);

    Candy []candiesArray = {candy1,candy2,candy3,candy4,candy5};
    ArrayList<Candy>candies = new ArrayList<>(Arrays.asList(candiesArray));
        for (Candy candy : candies) {
            System.out.println(candy.getBrand()+ " " + candy.getPrice());
        }

        for (Candy candy : candies) {
            System.out.println(candy);
        }





    }

    }



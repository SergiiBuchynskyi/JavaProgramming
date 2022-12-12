package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String myGroups[] = new String[5];
        System.out.println(myGroups);//hashcode

        myGroups[0] = "Gunay";
        myGroups[1] = "Neira";
        myGroups[2] = "Suat";
        myGroups[3] = "Hulya";
        myGroups[4] = "Mikael";

        System.out.println(Arrays.toString(myGroups));

//_____________________________
        String [] days = {"Monday", "Tuesday","Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"  };

        System.out.println(Arrays.toString(days));
        int number = 5;
        if(number<1 || number > 7){
            System.out.println("Invalid");
            System.exit(0);


        }
        System.out.println(days[number-1]);
    }

}

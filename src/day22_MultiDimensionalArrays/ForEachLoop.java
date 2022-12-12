package day22_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3},{4,5,6,7},{9,10,11,12}};

        for (int [] eachArray : arr2D ) {
            for (int eachElement: eachArray) {
                System.out.println(eachElement);
            }

        }




    }
}

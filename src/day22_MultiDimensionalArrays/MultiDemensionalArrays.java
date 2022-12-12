package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDemensionalArrays {
    public static void main(String[] args) {

        int []arr1 = {1,2,3};
        int []arr2 = {1,2,3};
        int []arr3 = {1,2,3};

        int [][] arr2D = {{1,2,3},{4,5,6,7},{9,10,11,12}};
             //index of 1D arr  0       1       2          0    1    2
        int [][][] arr3D = {{{1,2,3},{1,2,3},{1,2,3}} , {{60,70,100},{120,150,500}}};
                    //index of 2D arr   0                            1

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println(arr3D[0][1][2]);

        for (int[][] each2D:arr3D) {
            for (int[] each1D:each2D) {
                for (int eachElement: each1D) {
                    System.out.println(eachElement);

                }

            }
        }


    }
}

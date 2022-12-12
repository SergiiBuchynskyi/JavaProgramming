package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String [] g1 = {"John","Jack","James"};
        String [] g2 = {"John","Jack","James"};
        String [] g3 = {"John","Jack","James"};

        String [][] G = new String [3] [];

        G[0] = g1;
        G[1] = g2;
        G[2] = g3;
        System.out.println(Arrays.toString(G));// for SingleDemensionalArray!!!
        System.out.println(Arrays.deepToString(G));


        //-------------------------------------
/*
        {1,2,3}
        {4,5,6,7}
        {9,10,11,12}
*/
                   //index 0 1 2   0 1 2 3   0  1  2  3
        int [][] arr2D = {{1,2,3},{4,5,6,7},{9,10,11,12}};
                    //index  0         1          2
        int a = arr2D [2][2];


        System.out.println(arr2D[2][2]);
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));

    }
}

package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 87, 64, 47, 57, 94, 54, 80));

        ArrayList<Integer> gradeA = new ArrayList<>(scores);
        gradeA.removeIf(p-> !(p>=90 && p <=100));
        ArrayList<Integer> gradeB = new ArrayList<>(scores);
        gradeB.removeIf(p-> !(p>=80 && p <=89));
        ArrayList<Integer> gradeC = new ArrayList<>(scores);
        gradeC.removeIf(p-> !(p>=70 && p <=79));
        ArrayList<Integer> gradeD = new ArrayList<>(scores);
        gradeD.removeIf(p-> !(p>=60 && p <=69));
        ArrayList<Integer> gradeE = new ArrayList<>(scores);
        gradeE.removeIf(p-> !(p>=50 && p <=59));



        System.out.println(gradeA);
        System.out.println(gradeB);
        System.out.println(gradeC);
        System.out.println(gradeD);
        System.out.println(gradeE);


    }

}

package day17_While_DoWhileLoops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        while (!(age > 0 && age <=120)){
            System.err.println("Invalid! Re-enter!");
            age = scan.nextInt();
        }
        System.out.println("Are you US citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no") )){
            System.err.println("Re-enter answer");
            answer = scan.next().toLowerCase();
        }


    }
}

package day17_While_DoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) {

            if (i=='C'){
                continue;
            }
            System.out.println(i);
        }
//-------------------------
        for (int i = 1; i < 11; i++) {
            if (i%2 !=0){
                continue;
            }
            System.out.println(i);

        }

    }
}

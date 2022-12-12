package day08_LogicalOperators;

public class PosNegZero {
    public static void main(String[] args) {
        int n = 100;
        if (n<0){
            System.out.println(n + " isNegative");
        } else if (n>0) {
            System.out.println(n + " isPositive");
        }
                else{
            System.out.println(n + " isZero");
        }
    }
}

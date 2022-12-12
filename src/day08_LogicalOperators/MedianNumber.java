package day08_LogicalOperators;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 20;
        if (a>b && a<c || a>c && a<b){
            System.out.println(a + " is median");
        }
        if (b>a && b<c || b>c && b<a){
            System.out.println(b + " is median");
        }
        else {
            System.out.println(c +" is median");
        }
    }
}

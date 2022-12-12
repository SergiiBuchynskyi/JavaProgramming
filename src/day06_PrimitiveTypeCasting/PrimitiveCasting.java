package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        // IMPLICIT CASTING
        // you can directly assign smaller type variable to larger
        // byte to short = smaller to bigger
        byte  a = 100;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        // EXPLICIT CASTING
        // you can't directly assign larger type variable to smaller

        int x = 55;
        short y = (short) x;

        System.out.println(x + " : " + y);

        long j = 10000000;
        short k = (short) j;

        System.out.println(j  + " : " +  k);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n;

        System.out.println(n  + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1;
    }
}

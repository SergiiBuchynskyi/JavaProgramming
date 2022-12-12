package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num + 1);
        System.out.println(str + 1);


        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println(max1);
        System.out.println(min1);

        String s1 = "true";
        String s2 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);
        boolean r2 = Boolean.parseBoolean(s2);
        System.out.println(r1);
        System.out.println(r2);


        String s3 = "123";
        Integer x = Integer.valueOf(s3);
        Integer y = Integer.parseInt(s3);
        System.out.println(x);
        System.out.println(y);


        String s4 = "1.5";
        double z = Double.valueOf(s4);







    }
}
package day34_GarbageCollection;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main");

    }

    static {
        System.out.println("Static");
    }
    static {
        System.out.println("Static 2");
    }


}

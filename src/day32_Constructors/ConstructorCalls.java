package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constractor");
    }
  public ConstructorCalls(int a){
        this();
        System.out.println("Constractor with int Arg");
    }
  public ConstructorCalls(String str){
        this(10);
        System.out.println("Constractor with String arg");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        ConstructorCalls obj2 = new ConstructorCalls(10);
        ConstructorCalls obj3 = new ConstructorCalls("Java");


    }


}

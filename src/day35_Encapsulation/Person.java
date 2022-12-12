package day35_Encapsulation;

public class Person {

    static {
        String planet = "Earth";
        boolean isHuman = true;
        boolean hasNose = true;
        int numberOfWings = 0;
        int numberOfHead = 1;
    }



    public String name, language;
    public int age;
    public char gender;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }



}

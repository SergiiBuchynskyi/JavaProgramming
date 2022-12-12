package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Hasky", 'M', 2, "Small", "White");
        dog.eat();
        dog.drink();
        dog.bark();
        dog.move();
        dog.sleep();


        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M',3 , "Small","Grey");
        cat.meow();
        cat.drink();
        cat.eat();
        cat.scratch();
        cat.sleep();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'F', 5, "Large", "Orange");
        tiger.eat();
        tiger.drink();
        tiger.hunt();
        tiger.move();
        tiger.roar();
        tiger.sleep();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(tiger);

    }


}

package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name ="Lucy"   ;
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Hasky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 3, 'M', "Large", "Black");

        System.out.println(dog3);

        dog1.eat();

        dog2.bark();


    }

}

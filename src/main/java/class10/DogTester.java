package class10;

public class DogTester {
    public static void main(String[] args) {
        // creating an object of the class
        Dog dog1 = new Dog();

//        Dog => data type
//        dog1=> is a variable that holds the object
//        new Dog() = creating the object of dog class



        dog1.name="Jacky";
        dog1.breed="German";
        dog1.weight=15;
        dog1.color="Black";

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.age);
        dog1.bark();
        dog1.sleep();

        Dog dog2= new Dog();
        dog2.name ="Leo";
        dog2.breed ="Bulldog";
        dog2.weight =8;
        dog2.color ="White";
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        dog2.eat();
        dog2.sleep();

    }
}

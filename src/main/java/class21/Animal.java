package class21;

public abstract class Animal {

    private String name;
    private String color;

    static int noOfLegs=4;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("Animals sleep");
    }
    public abstract void speak();
    public void printInfo(){
        System.out.println(name+" "+color);
    }

}

class Dog extends Animal{


    public Dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void eat() {
        System.out.println("Dogs like to eat meat");
    }
    @Override
    public void speak() {
        System.out.println("wuff wuff");    }
}

class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat fish");
    }

    @Override
    public void speak() {
        System.out.println("moew meow");
    }
}

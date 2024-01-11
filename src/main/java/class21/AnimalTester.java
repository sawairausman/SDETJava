package class21;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c = new Cat("Mano","black");
        c.eat();
        c.speak();
        c.sleep();
        Animal c2 = new Cat("Mano","black");

        Animal [] arr ={new Cat("Mano","black"), new Dog("Mano","black")};
        for(Animal a:arr){
            a.eat();
            a.speak();
            a.sleep();
        }
    }
}

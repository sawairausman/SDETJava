package class18;

public class AnimalTester {

    public static void main(String[] args) {
        Dog d = new Dog("Jacky","Black",12,25);
        //d.demo("java");
        d.printInfo();
        Dog DogRef;
        DogRef = d;
        DogRef.printInfo();
    }
}

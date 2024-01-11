package class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jacky","Black",1,12);
        Dog d2 = new Dog("Macky","Brown",1,12);
        Dog d3 = new Dog("Becky","Black",1,12);
        Cat c1 = new Cat("Lovly","White",1,12);
        Animal a1 = new Animal("Animal","White",1,12);


        Animal [] arr ={d1,d2,d3,c1,a1};

        //Dog a2 = (Dog)arr[0]; casting down-casting
        Animal a2 =arr[0];
        a2.printInfo();

        Animal animal = arr[1];
        animal.printInfo();
//will not work you re tring to get obj of dog
       // Cat c = (Cat)arr[0];
        //will work now
        Cat c= (Cat)arr[3];


    }
}

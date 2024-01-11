package class17;
//super keyword n this keyword

class Grandparent{
    Grandparent(){
        System.out.println("Grandpa");
    }
}
public class Parent extends Grandparent {
    Parent(){
        System.out.println("Parent is born");
    }
    String name ="zion";
}
class Child extends Parent{

    Child(){
        System.out.println("Child is born");
    }
    String name ="Maria";
    void print(){
        String name ="Levi";
        System.out.println(this.name);
    }
}
class Tester{
    public static void main(String[] args) {
        Child c =new Child();
        c.print();
    }
}

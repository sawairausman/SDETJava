package class14;

public class Cat {

    //instance variable
    String name ="kitti";
    void pringName(){
        // local variable
        String name ="Pishak";
        System.out.println(name);
    }
//print the local variable
    public static void main(String[] args) {
        Cat c= new Cat();
        String nam =c.name;
        System.out.println(c.name);
       c.pringName();
    }
}

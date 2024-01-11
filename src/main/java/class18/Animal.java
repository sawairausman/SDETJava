package class18;

public class Animal {

    private String name;
    private String color;
    private int age;
    private double weight;

    public Animal(String name, String color, int age, double weight){
        this.name= name;
        this.color = color;
        this.age= age;
        this.weight=weight;
    }
    public void sleep(){
        System.out.println("zzZZZZ");
    }
    public void speak(){
        System.out.println("Animal speak");
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}

class Dog extends Animal{
    private String breed;
    Dog(String a, String b,int c, double d){
        super(a,b,c,d);
    }

    public void speak(){
        System.out.println("Wuff Wuff");
    }

    void demo(String str){
        System.out.println(str);
    }

    public void printInfo(){
        super.printInfo();
    }




}

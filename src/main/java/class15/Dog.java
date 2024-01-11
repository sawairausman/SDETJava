package class15;

public class Dog {
   private String name;
    private String breed;
    private String color;
    int age;

    Dog(String dName, String dBreed, String dColor, int dAge){
        name = dName;
        breed = dBreed;
        color = dColor;
        age = dAge;


    }


    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);

    }
}

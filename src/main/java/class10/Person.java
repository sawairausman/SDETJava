package class10;

public class Person {
    String name;
    char gender;
    int age, weight,height;
    void talk(){
        System.out.println("Can Talk..");
    }
    void smile(){
        System.out.println("Smiling.....");
    }
    void walk(){
        System.out.println("Walking....");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.age =20;
        person.height= 162;
        person.name = "Sam";
        person.gender ='f';
        person.weight =120;

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.height);
        System.out.println(person.weight);

        person.sleep();
        person.smile();
        person.talk();
        person.walk();


    }
}



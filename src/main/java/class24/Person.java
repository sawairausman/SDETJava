package class24;

import java.util.Map;
import java.util.TreeMap;
/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.*/

public class Person {
  private String name;
  private String lastName;
  private int age;
  private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}

 class TestClass{
     public static void main(String[] args) {
         Map <Integer, Person> map = new TreeMap<>();

         Person p1= new Person("Sawaira","Usman",30,160000);

         Person p2= new Person("Ashar","ozy",11,200000);
         Person p3= new Person("Arsal","Oz",5,222222);
         map.put(1,p1);
         map.put(2,p2);
         map.put(3,p3);

         map.forEach((k,v)-> {
             System.out.println(k+" ");
             v.printInfo();
         });





     }

}

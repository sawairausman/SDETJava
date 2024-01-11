package class14;

public class StaticPersonTester {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="zeeshan";
        p1.age=22;
        p1.weight=60;
        p1.printInfo();
        // recoomended to use class name with static variable // in java garbage collector
        //it runs and cleans the memory for you.

        System.out.println(Person.noOfEyes);
    }



}

package class16;
//mulitlevel

public class MultilevelTester {
    public static void main(String[] args) {
        Audi a= new Audi();
        Car v = new Car();
        //drive();
        a.drive();
        v.drive();
       Vehicle.drive();


    }}
class Vehicle{
    String color;
    public static void drive(){
        System.out.println("drive");
    }

    public static void main(String[] args) {
        Audi a= new Audi();
        Car v = new Car();
        drive();
        a.drive();
        v.drive();
        Vehicle.drive();

    }

}
class Car extends Vehicle{
    int noOfDoors =4;

}

class Audi extends Car{

    boolean badEngines = true;

}

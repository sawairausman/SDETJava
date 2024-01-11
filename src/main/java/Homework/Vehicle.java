package Homework;
//        reate a class named Vehicle
//        If no arguments are passed while creating an object of the class, it should print "I love vehicles".
//        If a String representing the type of vehicle (like "Car", "Bike") is passed, it should print "I love [VehicleType]".
//        For example, if "Car" is passed, it should print "I love Car"


public class Vehicle {

    public Vehicle(){
        System.out.println("i love vehicles");

    }

    public Vehicle(String car){
        System.out.println("I love "+car);
    }

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle("Tesla");
    }
}


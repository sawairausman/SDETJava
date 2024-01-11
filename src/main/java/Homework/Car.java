package Homework;
//Car Rental System:
//
//        1)Create a class Car with properties like make, model, and year.
//        Implement a method calculate_rental_price based on the number of rental days.
//        Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
//        Demonstrate the functionality by creating instances of each class and calling their methods
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void  calRentalPrice(int days, int price){

        System.out.println(this.make+ " "+this.model+" "+this.year+ " the rental price for "+days+ " days is "+"$"+days*price);

    }

}

class LuxuryCar extends Car{



    public LuxuryCar(String make, String model, int year) {
        super(make, model, year);
    }

    public void calRentalPrice(int days, int price){
        System.out.println();
        super.calRentalPrice(days, price);
        int cleaningCharges =300;
        System.out.println ("with additional Sneaky charges $"+ cleaningCharges);
        System.out.println();

    }


}

class EconomyCar extends Car{


    public EconomyCar(String make, String model, int year) {
        super(make, model, year);
    }

    public void calRentalPrice(int days, int price){
    super.calRentalPrice(days, price);

    }

}

class CarRentalTester{
    public static void main(String[] args) {
        new Car("Car", "older than", 2015).calRentalPrice(5,100);
        new LuxuryCar("Mercedes","G-Wagon", 2022).calRentalPrice(5,500);
        new EconomyCar("Toyata","Prius", 2023).calRentalPrice(5,150);
    }
}

package class10;

public class CarTester {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.model ="I7";
        bmw.color ="Blue";
        bmw.price =120000;
        bmw.drive();
        bmw.honk();
        bmw.ApplyBrakes();
    }
}

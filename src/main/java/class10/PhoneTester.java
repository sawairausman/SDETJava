package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        Phone iphone = new Phone();

       samsung.brand ="Samsung";
       samsung.software ="Android";
       samsung.color ="White";
       samsung.price=1200;
        System.out.println(samsung.brand);
        System.out.println(samsung.software);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        samsung.sendText();
       samsung.TakesPicture();
       samsung.iscall();

        System.out.println("-----------");
        iphone.brand="Apple";
        iphone.software="IoS";
        iphone.color= "Gold";
        iphone.price=2000;
        System.out.println(iphone.brand);
        System.out.println(iphone.software);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.price=2000;
        iphone.sendText();
        iphone.TakesPicture();
        iphone.iscall();

    }
}

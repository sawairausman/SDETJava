package MyOwnCode;

public class Swap2Numbers {

    public static void main(String[] args) {
        int a = 20, b = 30;



        a =a+b;
        b= a-b;
        a =a-b;

        System.out.println(a);
        System.out.println(b);
    }
}

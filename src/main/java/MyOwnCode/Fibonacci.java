package MyOwnCode;

public class Fibonacci {
    public static void main(String[] args) {
        int a =0;
        int b = 1;

        int num=10;


        for(int i =2; i<num;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;


        }
    }
}

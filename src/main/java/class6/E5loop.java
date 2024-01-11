package class6;

public class E5loop {
    public static void main(String[] args) {


        int i = 100;
        do{
            System.out.print(i+ " ");
            i--;
        }while(i>=1);
        System.out.println();
//        Print even numbers from 20 to 100
//        Expected output 20 22 24 26….. 100
        int j = 20;
        do{
            System.out.print(j+" ");
            j = j+2;
        }while(j<=100);
        System.out.println();

        int k = 99;
        do{
            System.out.print(k+ " ");
            k-=2;
        }while(k>=1);
    }
}

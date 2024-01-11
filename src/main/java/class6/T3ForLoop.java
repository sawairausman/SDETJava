package class6;

public class T3ForLoop {

    public static void main(String[] args) {

        //print numbers from 1 to 100 in 1 line with space
        for(int i =1; i<=100;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        //print numbers fromm 100 to 1
        for(int i= 100; i>=1;i--){
            System.out.print(i+ " ");
        }
        System.out.println();
        //print even numbers between 20 to 1
        for(int i=20; i>=1 ; i-=2){
            System.out.print(i+ " ");

        }
        System.out.println();
        int i = 20;
        while(i>=1){
            System.out.print(i+ " ");
            i-=2;
        }
        System.out.println();
        //print odd numbers between 20 and 50
        for(int j =19; j<50;j+=2){
            System.out.print(j+ " ");
        }
    }
}

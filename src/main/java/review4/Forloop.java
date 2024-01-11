package review4;

public class Forloop {
    public static void main(String[] args) {
        for(int i =0; i<4;i++){
            System.out.println("Hello "+i);
        }

        for(int i =2; i<=10; i+=3){
            System.out.println(i);
        }
        int i =1;
        do{
            System.out.println("hello");
            i++;

        }while(i>=4);

        int n =2;
        do{
            if(n%2==0) {
                System.out.println(n);
            }
                n++;

        }while(n<=10);

        int ii =2;
        do{
            if(ii%2==0) {
                System.out.println(ii);
                ii++;
            }


        }while(ii<=10);


    }
}

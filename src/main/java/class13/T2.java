package class13;

public class T2 {

    void even(int a){
        if(a%2==0){
            System.out.println( a+ " : is even Number ");

        }else{
            System.out.println(a+" : is odd Number");
        }

    }

    public static void main(String[] args) {
        T2 e = new T2();
        e.even(12);
        e.even(13);
    }

}

package class13;

public class T1 {

    void large(int a, int b){
        int c = a>b?a:b;
        System.out.println("large number is :" +c);
    }

    public static void main(String[] args) {
       T1 l =new T1();
       l.large(10,30);
    }
}

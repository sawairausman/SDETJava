package groupEx1Practice;

public class swap2Num {

    public static void swap(int a, int b){
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        swap(33,5);
    }
}

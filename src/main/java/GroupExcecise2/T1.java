package GroupExcecise2;

public class T1 {

    public static void swapTwoString( String a, String b){
        System.out.println(a+" "+b);
        a=a+b;
        b= a.substring(0,a.length()-b.length());
        a= a.substring(b.length());

        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        swapTwoString("sub","zero");
    }
}



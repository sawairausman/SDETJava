package groupEx1Practice;

public class Fibonnaci {


    public static void fibnacci(int num){
            int num3=0;
            int num1=0;
            int num2=1;

            for (int i = 0; i < num; i++) {
                System.out.print(num1+" ");
                num3=num1+num2;
                num1=num2;
                num2=num3;


            }
        }


    public static void main(String[] args) {
        fibnacci(8);
    }
}

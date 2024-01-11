package Homework;

public class PrivateStaticMethod {

    private static void method1(int num1, int num2){
        System.out.println(num1+num2);
    }

    private  static void method1(int num1, int num2, double num3){
        System.out.println(num1+num2+num3);
    }
    private  static void  method1(int num1, int num2, double num3, double num4){
        System.out.println(num1+num2+num3+num4);
    }

    public static void main(String[] args) {
        new PrivateStaticMethod().method1(10,20);
        new PrivateStaticMethod().method1(10,20,10.5);
        new PrivateStaticMethod().method1(10,20,10.5,10.5);

    }


}

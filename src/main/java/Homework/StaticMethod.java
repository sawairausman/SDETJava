package Homework;
//Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
//Class17
public class StaticMethod {

    public static void method1(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void method1(int num1, int num2, double num3){
        System.out.println(num1+num2+num3);
    }
    public static void method1(int num1, int num2, double num3, double num4){
        System.out.println(num1+num2+num3+num4);
    }

    public static void main(String[] args) {
      method1(10,20);
      method1(10,20,20.5);
      method1(10,20,20.5,20.5);
    }

}

package Homework;
/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
  Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
  Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.*/
//Class 17 HW
public class Programming {

    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String s){
        System.out.println("i love "+s);

    }

    public static void main(String[] args) {
        Programming p1= new Programming();
        Programming p2 = new Programming("Java");
    }



}

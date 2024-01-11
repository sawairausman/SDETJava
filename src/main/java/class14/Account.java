package class14;

public class Account {
    String accountNumber;
    double balanace;
    String username;
    String password;
   //private means only and only within the same class
    //default mean used within same package there is no keyword for default
    //when nothing writteem with variable or method it is defualt
    //public it will accessed within the whole project

    void printHello(){
        System.out.println("Welcome to bank of america");
    }
    public void Hello(){
        System.out.println("Welcome Customer");
    }

   private void printInfo(){
       System.out.println(accountNumber);
   }

}

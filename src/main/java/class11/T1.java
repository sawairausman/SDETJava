package class11;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String user = scanner.nextLine();
        System.out.println("Please enter your password");
        String pwd = scanner.nextLine();
        System.out.println("Please confirm the password");
        String confirmpwd = scanner.nextLine();
        if(user.isEmpty()|| pwd.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }else if(pwd.length()<8){
            System.out.println("Password is too short");
        }else if(pwd.contains(user)){
            System.out.println("Password cannot contain username");
        }else if(!pwd.equals(confirmpwd)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}

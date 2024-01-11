package class4;

import java.util.Scanner;

public class T3ScanTemp {

    public static void main(String[] args) {
        //Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city Name ");
        String city = sc.nextLine();
        System.out.println("Enter the temperature ");
        double temp = sc.nextDouble();

        System.out.println(" The temperature of the city "+city+ " is "+ ((temp - 32)/1.8)+"C" );
    }
}

package replit;

import java.util.Scanner;

public class repl105 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string " );
        String a = sc.nextLine();

        System.out.println(a.replaceAll("[^aeiouAEIOU]",""));

        StringBuffer sb= new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);

        StringBuffer sbb= new StringBuffer("Hello");

        System.out.println(sbb.reverse());

        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        System.out.println(str.indexOf(" "));

    }
}

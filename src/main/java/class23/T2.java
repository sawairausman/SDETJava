package class23;

import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {
        //three ways to retrieve daata
        TreeSet <String> countries = new TreeSet<>();
        countries.add("Pakistan");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");
        countries.add("Afghanistan");

        System.out.println(countries);

        for (String s : countries) {
            System.out.println(s);

        }
        countries.forEach(x-> System.out.println(x));

    }
}

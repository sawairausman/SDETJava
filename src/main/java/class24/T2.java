package class24;

import java.util.Map;
import java.util.TreeMap;

public class T2 {
    public static void main(String[] args) {
        Map<String, String> country = new TreeMap<>();

        country.put("Pakistan", "Islamabad");
        country.put("USA", "Washington DC");
        country.put("India", "New Dehli");
        country.put("Canada", "Ottawa");
        country.put("Mexico", "New Mexico");


        country.forEach((k, v) -> System.out.println(k + " " + v));
         country.forEach((k,v)-> System.out.println(v));

    }}
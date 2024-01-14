package class24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T4 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy= new HashMap<>();

        bestBuy.put(75562,"Monitor");
        bestBuy.put(75265,"Laptop");
        bestBuy.put(76325,"TV");
        bestBuy.put(75452,"Printer");
        bestBuy.put(75522,"Computer");
        bestBuy.put(75115,"Switch");
        //Set<Map.Entry<Integer, String>> entries = bestBuy.entrySet();

        Set<Map.Entry<Integer, String>> s = bestBuy.entrySet();
        for( Map.Entry<Integer, String> e:s){
            System.out.println(e);
        }
     }
}

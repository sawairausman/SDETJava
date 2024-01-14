package class24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E3Maps {
    public static void main(String[] args) {
        //extract keys and values spearately
//var maps = new HashMap<>();
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Apple",20);
        // maps.replace("Apple",30);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        //
        //returns all the keys in the form of Set
        System.out.println(maps.keySet());
        System.out.println(maps.values());

        // maps don't impletments of collection but set it so we can
        //
       // Collections <String> key = maps.keySet()
        var keys = maps.keySet();
        var arrayList = new ArrayList<>(keys);
        for (String k:keys){ //for(var k:keys)
            System.out.println(k);
        }
    }
}

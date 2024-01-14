package class24;

import java.util.HashMap;
import java.util.Map;

public class LamdainMapss {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Apple", 20);
        // maps.replace("Apple",30);
        maps.put("Banana", 15);
        maps.put("Kiwi", 5);
        maps.put("Orange", 20);

//convert map into collection to use the removeIf()
        //convert it into entrySet. coz entrySet is a collection
        maps.entrySet().removeIf(e -> e.getKey().contains("i"));
        maps.entrySet().removeIf(e -> e.getValue()==5|| e.getKey().contains("O"));

        System.out.println(maps);

    }
}


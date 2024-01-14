package class24;

import java.util.HashMap;
import java.util.Map;

public class E1Map {
    public static void main(String[] args) {
        Map <String, Integer> maps = new HashMap<>();

        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        System.out.println(maps.size());
//contains key check if the key is present or not
        System.out.println(maps.containsKey("Apple".toLowerCase()));
        System.out.println(maps.containsValue(20));
        System.out.println(maps.isEmpty());
        //value of any key pass the name of the key to get the value/
        System.out.println(maps.get("Kiwi"));
    }
}

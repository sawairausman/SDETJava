package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class T1 {
    public static void main(String[] args) {
        Map <Integer, String> building = new LinkedHashMap<>();
        //keep data in order
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Facebook");
        building.put(4,"Apple");
        building.put(5,"Amazon");
        building.put(6,"Snapchat");
        building.put(7,"Tiktok");
        System.out.println(building);

        System.out.println(building.size());
        building.replace(3, "Uber");//have to give key as values can duplicate
        building.put(4,"LG");//put is going insert a new entry if it doesnt exist however if you use
        //it will not insert new entry...replace only replace but put will if something is not present
        //it will add...instead of putting data instead of putting it.


        //building.remove(4);






    }
}

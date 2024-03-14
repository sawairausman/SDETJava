package class25;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class E7NestedData {
    public static void main(String[] args) {

        //in value will be a complete array list which can contain 1000 of elements
//

        Map<Integer,ArrayList<Integer>> map= new LinkedHashMap<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(10);
        arr1.add(12);
        arr1.add(15);

        ArrayList<Integer> arr2= new ArrayList<>();
        arr2.add(5);
        arr2.add(3);
        arr2.add(2);

        map.put(1,arr1);
        map.put(2,arr2);
        System.out.println(map);

        //for every row we will create a map
        //key will be coming from the header


        //create map to store these complete arrays inside a map

    }
}

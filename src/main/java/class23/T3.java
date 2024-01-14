package class23;

import java.util.LinkedHashSet;
import java.util.Set;

//Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;

public class T3 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Toronto");
        cities.add("New York");
        cities.add("Vancouver");
        cities.add("Amsterdam");
        cities.add("Calgary");
        cities.add("California");
        cities.add("Berlin");
        cities.add("Aurora");
        cities.add("Ankara");
        cities.add("Alexandria");
        System.out.println(cities);

        //enhanced for loop can never be used for
        //change he index ..its dynamic..its giong to change size in runtime..not like arrays. array is fixed in size
        //collection framework is dynamic framework. after every iteration the size of the original list will chang
        //the loop cannot work properfuly
        //concurrentmodificationexceptions comes..
        //enchanced for loop will never work always use removeif methos
//        for(String c: cities){
//
//        }

        cities.removeIf(x->x.toLowerCase().startsWith("a"));
       cities.forEach(x-> System.out.println(x));
    }
}

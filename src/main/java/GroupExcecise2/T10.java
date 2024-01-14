package GroupExcecise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class T10 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays
                .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("Arrays with duplicates: "+list);
        ArrayList <Integer> newList = new ArrayList<>();


        for (Integer i : list) {

            //if this element is not present in newList
            //then add it
            if(!newList.contains(i)){

                newList.add(i);
            }

        }
        //to sort we use treeset
        TreeSet<Integer> sortList = new TreeSet<>(newList);
        System.out.println(sortList);

        ArrayList<String> cars=new ArrayList<>();
        cars.add("mercedes");
        cars.add("bmw");
        cars.add("audy");
        cars.add("cadillac");
        cars.add("bmw");
        cars.add("audy");
        cars.add("infinity");
        for (int i=0;i<cars.size();i++){
            for (int j = i+1; j < cars.size() ; j++) {
                if (cars.get(i).equals(cars.get(j))){
                    System.out.println("duplicate found: "+cars.get(i));
                    cars.remove(j);
                }
            }
        }
        //TreeSet<String> sortedList = new TreeSet<>(cars);
        System.out.println(cars);
    }


}

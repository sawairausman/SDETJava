package GroupExcecise2;

import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println(newList);


    }
}

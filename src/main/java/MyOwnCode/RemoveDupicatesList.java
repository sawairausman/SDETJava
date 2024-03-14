package MyOwnCode;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDupicatesList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(3);

        ArrayList<Integer> newlist= new ArrayList<>();

        for(Integer e:list){

            if(!newlist.contains(e)){
                newlist.add(e);
            }

        }
        Collections.sort(newlist);
        System.out.println(newlist);
    }
}

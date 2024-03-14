package class25;

import java.util.ArrayList;

public class E6NestedData {
    public static void main(String[] args) {
        //obj of any collection we specify angle bracket what we are going to store
        //you an store entire arraylist inside a arraylist wihcih will look like
        //nested arraylist
        ArrayList<String> names = new ArrayList<>();

        //arraylist1 n arraylist2 we can create a big list
        //arrray list inside another arraylist it allows us to build any datastructure
        //of our choice, nest anyother data structure in another data structure

        ArrayList<ArrayList<Integer>> nestedArr = new ArrayList<>();

        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(10);
        arr1.add(12);
        arr1.add(15);

        ArrayList<Integer> arr2= new ArrayList<>();
        arr2.add(5);
        arr2.add(3);
        arr2.add(2);

        nestedArr.add(arr1);
        nestedArr.add(arr2);
        System.out.println(nestedArr);



    }
}

import java.util.ArrayList;
import java.util.Collections;

public class PracticeMock6 {
//    public static void secondLargest(int [] array){
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = i+1; j < array.length; j++) {
//                int temp =0;
//                if(array[i]>array[j]){
//
//                    temp=array[i];
//                    array[i]=array[j];
//                    array[j]=temp;
//
//                }
//
//
//            }System.out.print(array[i]+" ");
//
//
//
//        }   System.out.println();
//        System.out.println(array[array.length-2]);
//
//    }
//
//
//
    public static void main(String[] args) {
//        int [] array = {5,3,6,8,2,3,1};
//        secondLargest(array);
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(5);
        System.out.println(list);

        //Collections.sort(list);

        ArrayList <Integer> newlist = new ArrayList<>();
        for(Integer i:list){
            if(!newlist.contains(i)){
                newlist.add(i);
            }
        }
        Collections.sort(newlist);

        System.out.println(newlist.get(newlist.size() - 2));


        int [] array= {1,2,3,4,5};
        for(int j =array.length-1; j>=0;j--){
            System.out.print(array[j]+" ");


        }
        System.out.println("***********");


        int [] arrays = {1,2,2,5,3,2,5,2,5,9};

        int n =arrays.length;

        for (int i = 0; i <arrays.length-1; i++) {
            int temp =0;
            for (int j = i+1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;

                }
            }
            }

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");

        }

        }


        }














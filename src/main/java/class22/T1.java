package class22;

import java.util.ArrayList;

//Create an ArrayList that will store 5 names into it.
//        Find out whether the given ArrayList is empty or not?
//        Check whether the specific name is present in an ArrayList or not?
//        Find the size of your arrayList and print all values from tha

public class T1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        names.add("Savera");
        System.out.println(names);

//        System.out.println(names.isEmpty());
//        System.out.println(names.contains("Kamla"));
//        System.out.println(names.size());
//        System.out.println(names);
//print yes if a name contains the letter o otherwise no for all the names
//        for (String s:names) {
//            //String name = names.get(i);
//
//            if(s.contains("o")){
//                System.out.println("yes");
//            }else{
//                System.out.println("no");
//            }
//        }
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
                    if(name.contains("o")){
                        names.set(i, "java");//there is no replace method in arrayList this set method is doing exactly the same
                    }

        }
        System.out.println(names);
    }
}

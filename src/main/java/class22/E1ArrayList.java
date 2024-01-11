package class22;

import java.util.ArrayList;

public class E1ArrayList {

    //store and manipulate data easily in this class we don't speicify the sizze anywhere


    public static void main(String[] args) {
        //syntax to create obj of arraylist class
        //methods to add , delete, search elements.

        ArrayList <String> names= new ArrayList<>();
        System.out.println(names.size());
        names.add("Bikal");
        System.out.println(names.contains("Bikal"));
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println(names);
//reuturns boolean when something is present
        System.out.println(names.contains("Kamla"));
        //remove method
        System.out.println(names.remove("Kamla"));//overloaded method by directly passing the elments
        //remove elements based on elemets.
        System.out.println(names.remove(3));
        System.out.println(names.get(0));//just like arrays. it stores data in index

        names.set(0,"Nasima");
        names.add(1,"Savera");
        System.out.println(names.indexOf("Poorna"));

        System.out.println(names.toString());
        System.out.println(names);






    }
}

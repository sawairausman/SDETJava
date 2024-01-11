package class22;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println(names.toString());

        for (int i = 0; i < names.size(); i++) {
            String s =names.get(i);
            System.out.println(s.length());//number of elements in each name

        }
        for(String s:names){
            System.out.println(s);
        }
        //there are more ways to go through the elements than loops

    }
}

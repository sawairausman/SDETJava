package class24;

import java.util.ArrayList;

public class LamdainArray {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fah");
        names.add("Maria");
        names.add("Ray");
        names.add("Hay");
        names.add("Jay");

        names.forEach(e-> System.out.println(e));
        System.out.println("******************");

        names.forEach(e-> {
            if(e.contains("a")){
                System.out.println(e);
            }
        });
//has to be condition
        names.removeIf(d-> d.length()>3);
        System.out.println(names);

    }


}

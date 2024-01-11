package GroupExcecise2;

import java.util.ArrayList;

public class T8 {
    public static void main(String[] args) {


        ArrayList <String> names= new ArrayList<>();
        names.add("Anna");
        names.add("Aria");
        names.add("Maria");
        names.add("Ashar");
        names.add("Arsal");
        names.add("Bilal");

        for (String s : names) {
            if(s.startsWith("A")|| s.startsWith("a")){
                System.out.println(s.toLowerCase());
            }

        }
        }

    }



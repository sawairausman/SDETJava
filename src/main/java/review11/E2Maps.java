package review11;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John",95);
        studentsMap.put("Adam",88);
        studentsMap.put("Muh",92);
        studentsMap.put("Kat",91);
        studentsMap.put("Kari",90);
        System.out.println(studentsMap);
        //converting linkedhashMap to arraylist picks the name of the students who got more than 90 print names and
        //store in the list.
        ArrayList<String> names=new ArrayList<>();
        studentsMap.forEach((k, v)->{

            if(v>90)
                names.add(k);
        });
        System.out.println(names);
    }

    }


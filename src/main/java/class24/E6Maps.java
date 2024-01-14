package class24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E6Maps {

    public static void main(String[] args) {
        //data is in order thats why we call it insertion order
        //how we can iterate through the data many different ways..but maps dont
        //directly support loop like normal for loop..data not stored in index
        //tweek things lil bit.

        Map<Integer, String> studentsMap = new LinkedHashMap<>();
        studentsMap.put(1,"Sino");
        studentsMap.put(2,"Nasima");
        studentsMap.put(3,"Karimi");
        studentsMap.put(10,"Ray");
        studentsMap.put(5,"Halil");
        System.out.println(studentsMap);


       Set<Map.Entry<Integer, String>> entries = studentsMap.entrySet();
        //var keyword even if you nested data type. and automatically replaces it

        //var studentEntries = studentsMap.entrySet();
        //individual entries are extracted
        for(var e:entries){
            if(e.getKey()>2) {
                System.out.println(e.getKey() + " " + e.getValue());

            }


        }
        System.out.println("---------------------");
        var entries2 = studentsMap.entrySet();
        for(var e:entries2){
            var key = e.getKey();
            var value = e.getValue();
            System.out.println(key+ " "+value);
        }
        System.out.println("-----------------------");
//k is for key, v is for value
        studentsMap.forEach((k,x)-> System.out.println(k+" "+x));






    }
}

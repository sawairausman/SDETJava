package class24;

import java.util.HashMap;
import java.util.Map;
/* Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest
 salary. Output should be in the below format
 John Smith=$100000*/

public class T3 {
    public static void main(String[] args) {
        Map <String, Double> map = new HashMap<>();
        //sorts data in keys not values

        map.put("John", 550000.0);
        map.put("Smith",25555.0);
        map.put("Ava",500000.0);
        map.put("Ari",60000.0);
        map.put("Anna",450000.0);

//        map.entrySet().removeIf(e->e.getValue()<100000);
//        System.out.println(map);

//        map.forEach((k,v)->{
//            double highsalary=0;
//            if(v>highsalary){
//                highsalary=v;
//
//            }
//            System.out.println(highsalary);
//
//
//        });
        String empName="";
        double salary=0;
   for(var e:map.entrySet()){
       if(e.getValue()>salary){
           empName=e.getKey();
           salary=e.getValue();
       }

   }
        System.out.println(empName+" "+salary);

    }
}

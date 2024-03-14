package GroupExcecise2;

import java.util.Map;
import java.util.TreeMap;

public class occerence {
    public static void main(String[] args) {

        String str1="listenn";
        String str2="silent";
        System.out.println(countChar(str1));

    }

    public static Map<Character,Integer> countChar(String str){

        Map<Character,Integer> map=new TreeMap<>();

        for(char c:str.toCharArray()){

            if(map.get(c)==null){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }

        }

        return map;
    }
}

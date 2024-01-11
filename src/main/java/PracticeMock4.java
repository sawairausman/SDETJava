import java.util.ArrayList;
import java.util.Arrays;

public class PracticeMock4 {

    public static void anagram(String a, String b){

        if(a.length()!=b.length()){
            System.out.println("These two String can't be anagrams");
        }
        char [] a1= a.toCharArray();
        char [] b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1,a1)){
            System.out.println("they are anagram");
        }else{
            System.out.println("they are not anagrams");
        }
    }

    public static void printNum(int n){
        if(n<=100){
            System.out.print(n+" ");
            n++;
            printNum(n);
        }
    }



    public static void main(String[] args) {
        anagram("silent","listen");
        printNum(1);

        ArrayList<String> list = new ArrayList<>();
        list.add("Abc");
        list.add("Abc");
        list.add("yoga");
        list.add("yoga");
        list.add("deep");
        list.add("ashar");
        list.add("arsal");
        list.add("arsal");
        ArrayList<String> newlist =new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {


           if(!newlist.contains(list.get(i))){
               newlist.add(list.get(i));
           }

            //System.out.println(newlist);
        }System.out.println(newlist);

        ArrayList<Integer> listt = new ArrayList<>();
        listt.add(1);
        listt.add(1);
        listt.add(5);
        listt.add(2);
        listt.add(2);
        listt.add(6);
        listt.add(7);
        listt.add(8);
        ArrayList<Integer> newlistt =new ArrayList<>();


        for (int i = 0; i < listt.size(); i++) {


            if(!newlistt.contains(listt.get(i))){
                newlistt.add(listt.get(i));
            }

            //System.out.println(newlist);
        }System.out.println(newlistt);

    }
}

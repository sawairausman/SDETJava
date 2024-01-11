package class22;

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV e");

        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("e") || words.get(i).endsWith("a")){
                //another elements takes its place and also takes the index of that element
                words.remove(i);
                //arraylist is dynamic it changes its size in run time it changes the indexes will rearrange it self
                i--;
            }

        }
        System.out.println(words);
        //easy way to write removeIf


        //removeIf has a loop inside it.it does the iterations internally
        //print the elements using lamba expression
        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);

        words.forEach(x-> System.out.println(x));

    }

}

package class22;

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();

        drinks.add("coffee");
        drinks.add("cola");
        drinks.add("Milk");
        drinks.add("sprite");
        drinks.add("tea");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if(drink.contains("a")|| drink.contains("e")){
                drinks.set(i,"water");
            }

        }
        System.out.println(drinks);

    }
}

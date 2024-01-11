package class22;

import java.util.ArrayList;

public class HW {

    public static void main(String[] args) {
        //Create an arraylist of cars and retrieve all the values using 2 different ways.
        ArrayList <String> cars = new ArrayList<>();
        cars.add("mercedes");
        cars.add("ford");

        cars.add("bmw");
        cars.add("ferrari");
        cars.add("tesla");

        for (String car : cars) {
            System.out.print(car+" ");
        }
        for (int i = 0; i < cars.size(); i++) {
            String car= cars.get(i);
            System.out.println(car);

        }




    }
}

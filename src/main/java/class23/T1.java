package class23;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        List<String> aList =new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(aList);

        Set<String> removeDup = new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(removeDup);
        System.out.println(aList);

    }
}

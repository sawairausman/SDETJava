package review11;

import java.util.LinkedList;

public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,i);

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        //1 sec has 1000 milisecond
        //if you use wrong data structure it will going to alot of time based on the operations we are goign to perfomr
        //accessing elements we should be going for arraylis
        //linkedlist for adding removing elements
    }
}

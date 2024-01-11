package review5;

import java.util.Arrays;

public class E3 {
    public static void main(String[] args) {
        String [] students = new String[5];
        students[0]= "kendi";
        students[1]= "Adam";
        students[2]= "John";
        students[3]= "Ali";
        students[4]= "Sino";

        for(int i =0; i<students.length; i++){
            if(students[i].equals("John"))
            students[i]="Good student";
            System.out.print(students[i]+ " ");

        }
        System.out.println();

        //shortcut method to sout in row
        System.out.println(Arrays.toString(students));

    }
}

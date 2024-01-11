package class22;

import java.util.Arrays;

public class E1CF {
    public static void main(String[] args) {

        String name ="Maria";
        String [] names ={"Canana","Halil","Swati"};
        //very big problem with arrays;
        //he arrays are fixed in size, once youve created an araay, and once you
        //have stored, later on when you want to store more values you wont be able to
          //do that.

        //names[3]="Bikal";
        //once an array has been created, down the road you'can't change the size
        //size is fixed.if i have thousands of elements will i end up
        //writing extra logic loop and if else.if we have to remvoe the entity
        //
        //arrrays are not classes. everything you want to do you have to wrtie your
        //own logic like in string class.here in arrays we don't have any such
        //methods.
        //limitations in array
        //1.they are fixed in size
        //2.theyare no build in methods present in the array
        //java developers created classes they created lots of classes
        //those classes don''t have those issues.

        String[] students = new String[100];
        System.out.println(Arrays.toString(students)); //printing array elements

    }
}

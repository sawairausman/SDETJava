package class2;

public class FindHighAndLowValueInArray {
    public static void main(String[] args) {


        int [] marks = {25,56,96,55,22,33,77,11};

        int highMarks = marks[0];
        int lowMarks = marks[0];

        for (int i =1; i<marks.length; i++)
        {
            if(marks[i]> highMarks){
                highMarks= marks[i];

            }

        }

        System.out.println("highest value in the Array "+ highMarks);
        for (int j =1; j< marks.length; j++){
            if(marks[j]< lowMarks){
                lowMarks = marks[j];

            }


        }
        System.out.println("low value in the Array "+lowMarks);


    }
    }




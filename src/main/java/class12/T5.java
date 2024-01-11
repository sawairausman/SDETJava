package class12;

public class T5 {
    public static void main(String[] args) {
        String str ="This is sentence i want to reverse";

    //separate out words we use split method it returns arrays of string
        String [] words = str.split(" ");
        for(String w:words){

            for (int i = w.length()-1; i >=0 ; i--) {
                System.out.print(w.charAt(i));

            }
            System.out.print(" ");
        }


     }




    }






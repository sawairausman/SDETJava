package class8;

public class T1Array {
    public static void main(String[] args) {
         String[] names ={"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};
        int times=0;

        //Write a program to count how many times the name zeeshan
        //appeared in the array
         for(int i =0; i<names.length;i++){
             if(names[i].equals("Zeeshan")){
                 times++;

             }


         }
        System.out.println("Zeeshan appeared "+times);
    }
}

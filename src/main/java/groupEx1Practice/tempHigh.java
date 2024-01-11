package groupEx1Practice;

public class tempHigh {
    int hightemp=0;
    int sum =0;

   public int temper(int [] temp){
       int hightemp=temp[0];
       for (int i = 0; i < temp.length; i++) {

               if(temp[i]>hightemp){
                   hightemp=temp[i];
               }

           }
       return hightemp;


   }

   public static void lowTemp(int [] temp){
       int low=temp[0];
       for (int i = 0; i < temp.length; i++) {

               if(temp[i]<low){
                   low= temp[i];
               }
           } System.out.println("low temp is "+low);

       }



   public int sumOfArray(int [] array){
       for (int i = 0; i < array.length; i++) {
           sum+= array[i];

       }
       return sum;
   }

   public void printEvenNum(int [][] array) {


       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               if(array[i][j]%2==0){
                   System.out.print(array[i][j]+" ");
               }
           }

           }
   }


    public static void main(String[] args) {
       tempHigh th=new tempHigh();
        int [] temp ={10,22,55,66,33,6,7};
        System.out.println(th.temper(temp));
        lowTemp(temp);
        System.out.println(th.sumOfArray(temp));

        int [][] arr ={{2,4,6,8,10},{6,5,2,3,5}};
        th.printEvenNum(arr);

    }

}

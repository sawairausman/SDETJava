package groupEx1Practice;

public class Sum {

    public static void sumEven(int [][] array){
        int sum=0;
      for(int[] n:array){
          for(int m:n)
          if(m%2==0){
              sum+=m;
          }
          }
        System.out.print("sum of even numbers "+sum);
        System.out.println();
      }

      public static void sumOdd(int [][] array){
        int sum=0;
        for(int [] n:array){
            for(int m:n){
                if(m%2!=0){
                    sum+=m;
                }
            }
        }
          System.out.println("sum of odd number "+sum);
      }

    public static void main(String[] args) {
        int [][] arr ={{2,4,6,8,10},{6,5,2,3,5}};
        sumEven(arr);
        sumOdd(arr);

        }


    }






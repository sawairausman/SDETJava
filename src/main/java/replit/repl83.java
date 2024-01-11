package replit;

public class repl83 {

    public static void cencorLetter(String s, char c){


        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='c'){

            }
              }
    }
    public static void main(String[] args) {


        cencorLetter("computer science",'c');
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for(int i =0;i<a.length;i++){
            int sum=0;
            for(int j =0;j<a[i].length;j++){
                sum+=a[i][j];
            }

            System.out.println(sum);


        }

        int[][] b = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for(int [] row:a){
            for(int col:row){
                System.out.println((col*2)+" ");
            }
            System.out.println();
        }
        String s ="Timmy";

        System.out.println(s.length());

    }
}

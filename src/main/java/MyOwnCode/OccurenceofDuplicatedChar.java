package MyOwnCode;

public class OccurenceofDuplicatedChar {


    public static void occurDupChar(String str){
        char [] c= str.toCharArray();
        int count;
        for(int i =0; i<c.length;i++){
            count =1;
            for(int j =i+1;j<c.length;j++){
                if(c[i]==c[j] && c[i]!=' '){
                    count++;
                    c[j]='0';//not counted in the next iteration
                }


            }
            if(count>1 && c[i]!='0'){
                System.out.println(c[i]+ " "+ count);
            }
        }
    }

    public static void main(String[] args) {
        occurDupChar("raghav sharma");
    }
}

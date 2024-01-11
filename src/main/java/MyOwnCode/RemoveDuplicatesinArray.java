package MyOwnCode;

public class RemoveDuplicatesinArray {
    public static void main(String[] args) {
        int [] num = {1,2,2,3,4,4,5,6,6};
        int n = num.length;
        for(int i =0; i<n;i++){
            for(int j = i +1; j<n;j++){
                if(num[i]==num[j]){
                    for(int k = j ; k<n-1; k++){
                        num[k]=num[k+1];
                    }
                    n--;
                    j--;
                }
            }


                }
        for(int i = 0; i< n; i++){
            System.out.println(num[i]+ " ");
            }

        }
        }



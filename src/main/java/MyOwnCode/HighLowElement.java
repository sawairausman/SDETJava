package MyOwnCode;

public class HighLowElement {
    public static void main(String[] args) {
        int [] temp={5,9,10,14,23,5,3};

        int highTemp = temp[0];
        int lowTemp =temp[0];
        for(int i= 0; i<temp.length;i++){
            if(temp[i]>highTemp){
                highTemp= temp[i];
            }


        }
        for(int j= 0; j<temp.length;j++){
            if(temp[j]<lowTemp){
                lowTemp= temp[j];
            }
        }
        System.out.println("Hightest Temp of week :"+highTemp+"C");
        System.out.println("Lowest Temp of week "+lowTemp+"C");
    }
}

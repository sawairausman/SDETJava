package class2;


public class FindElementinArray1 {
    public static void main(String[] args) {

        float [] temp ={1f,2.3f,55f,8f,6.3f,7.3f};
        float num = 55f;

        boolean isInArray = false;

        for(float element:temp){
            if(element==num) {
                isInArray = true;
                break;
            }}
        if(isInArray){
            System.out.println("The element is in the Array");

        }
        else{
            System.out.println("The element is not in the Array");
        }



            }

        }




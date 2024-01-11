package class5;

public class E5LogicalOperators {

    public static void main(String[] args) {

        boolean is4GAvail = true;
        boolean isWifiAval = false;

        if(is4GAvail || isWifiAval){
            System.out.println("You can browse the internet");
        }else{
            System.out.println("Can't use internet");
        }

    }
}

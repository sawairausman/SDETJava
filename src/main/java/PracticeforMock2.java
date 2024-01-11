import java.util.ArrayList;

public class PracticeforMock2 {


    public static void fibbonaci(int n){

        int a =0;
        int b=1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;

        }

    }


    public static void main(String[] args) {

        fibbonaci(10);



        ArrayList<String> s = new ArrayList<>();

        s.add("Anna");
        s.add("Ashar");
        s.add("Aria");
        s.add("Savera");
        s.add("bilal");

        System.out.println(s);
        for(String news:s){
            if(news.startsWith("A")||news.startsWith("a")){
                System.out.println(news.toLowerCase());
            }
        }

        String r ="abracadabra";

        for (int i = 0; i < r.length(); i++) {
            boolean isunique=true;
            for (int j = i+1; j < r.length()-1; j++) {
                if(r.charAt(i)==r.charAt(j)){
                    isunique=false;
                    break;
                }

                }
            if(isunique){
                System.out.println("Non repeating character is: "+ r.charAt(i));
                break;

            }

        }

        String str ="abracadabra";


        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = i+1; j < str.length()-1; j++) {
                if(  str.charAt(i)==str.charAt(j)) {
                    unique= false;
                    break;
                }


            } if(unique){
                System.out.println(str.charAt(i));
                break;
            }


        }


    }

}

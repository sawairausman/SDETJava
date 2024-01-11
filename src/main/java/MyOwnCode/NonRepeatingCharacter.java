package MyOwnCode;

public class NonRepeatingCharacter {
    public static void main(String[] args) {


        String str ="abracadabra";


        for (int i = 0; i < str.length(); i++) {
            boolean isunique = true;
            for (int j = i+1; j < str.length()-1; j++) {
                if(  str.charAt(i)==str.charAt(j)) {
                    isunique= false;
                    break;
                }


                } if(isunique){
                System.out.println("Non repeating character is: "+str.charAt(i));
                break;
            }


            }


        }

    }


package class11;

public class E8StringDemo {
    public static void main(String[] args) {
        String str ="Today is Saturday";
        //gives index of the letter
       System.out.print(str.indexOf("a",2));


        //if something does not exist it will give -1
        System.out.println(str.indexOf('T'));
//        for (int i = 0; i < str.length(); i++) {
//
//               if(str.charAt(i)=='a'){
//                   System.out.println(i);
//               }
//            }

        }
    }


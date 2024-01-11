package MyOwnCode;

public class StringStartsWith {

//    You have a list of strings and you want to keep only those that start
//    with “A” and you want to return them in lower case"


    public static void main(String[] args) {

            String s = "An Apple a day keeps doctor Away";

            String[] ss = s.split(" ");
            String newstring = "";
            for (String word : ss) {
                if (word.startsWith("A")|| word.startsWith("a")) {
                    newstring= word;
                    System.out.print(newstring.toLowerCase()+ " ");
                }

            }
        }


    }




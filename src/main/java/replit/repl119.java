package replit;

public class repl119 {
    public String censorLetter(String str, char c){
        String newString="";

        for(int i =0; i <str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                newString =str.replace(str.charAt(i), '*');


            }
        }return newString;

    }
    public static void main(String[] args) {
        repl119 obj = new repl119();
        System.out.println(obj.censorLetter("computer science",'e'));
        System.out.println(obj.censorLetter("trick or treat", 't'));
    }
}


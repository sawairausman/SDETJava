package class8;

public class E7EnhancedLoopLimitation {
    public static void main(String[] args) {
        char[] word ={'S','u','n','d','a','y'};

        // no index tracking can be done with enchanced loop
        // so no reversing the array

        for(int i = word.length-1; i>=0;i--){
            System.out.print(word[i]+ ",");
        }


    }
}

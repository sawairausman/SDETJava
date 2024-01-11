package class12;

public class T {
    public static void main(String[] args) {
        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr= str.split("[?]");
        System.out.println("Total number of sentences are "+strArr.length);

    }
}

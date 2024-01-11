package Homework;

public class HWClass14T3 {


    public String vowels(String VowelString){
        String newVowelString = "";
        return newVowelString = VowelString.replaceAll("[^AEIOUaeiou]","");

    }

    public static void main(String[] args) {
        System.out.println(new HWClass14T3().vowels("Umbrellaaa"));
    }
}

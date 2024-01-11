package review6;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Today is a JAVA review class";
        //charAt will provide character based on index
        //takes index(int) as input
        int count=0;
        System.out.println(str.charAt(0));
        str = str.toLowerCase();
        for (int i = str.length()-1; i >= 0; i--) {
          // System.out.print(str.charAt(i));

            if(str.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);

    }
}

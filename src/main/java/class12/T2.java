package class12;

public class T2 {
    public static void main(String[] args) {
        String str = "bkfdSAHBDSH2232398487#Y*&#$%";

        int uppercase =0;
        int lowercase =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                uppercase++;
            }else if(ch>=97 && ch<=122)
                lowercase++;
            }

        System.out.println("uppercase letters "+ uppercase);
        System.out.println("lowercase letters "+lowercase);

        System.out.println("-------------------------");
        System.out.println(str.replaceAll("[^A-Z]","").length());
        System.out.println(str.replaceAll("[^a-z]","").length());

    }






    }


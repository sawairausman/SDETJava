package class13;

public class T4 {
    void hello(String name){
        if(name.equalsIgnoreCase("China")){
            System.out.println("Ni Hao is Hello in "+ name );
        }else if(name.equalsIgnoreCase("India")){
            System.out.println("Namaste is Hello in "+ name);
        }else if(name.equalsIgnoreCase("Mexico")){
            System.out.println("Hola is Hello in "+name);
        }else if(name.equalsIgnoreCase("France")){
            System.out.println("Bonjout is Hello in "+name);
        }else if(name.equalsIgnoreCase("Italy")){
            System.out.println("Ciao is Hello in "+name);
        }
    }

    public static void main(String[] args) {
        T4 n = new T4();
        n.hello("Italy");
        n.hello("India");
    }
}

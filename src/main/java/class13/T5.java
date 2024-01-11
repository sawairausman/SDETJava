package class13;

public class T5 {

    void createEmail(String firstName, String lastName, String emailtype){
        System.out.println(firstName+lastName+"@"+emailtype+".com");
    }

    public static void main(String[] args) {
        T5 n = new T5();
        n.createEmail("sawaira","usman","gmail");
    }
}

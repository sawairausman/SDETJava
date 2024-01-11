package replit;

public class repl142 {
    String schoolName;
    int batch;
    int year;
    String lastDayofClass;

    repl142(){

    }
    repl142(String schoolName, int batch, int year, String lastDayofClass){
        this.schoolName=schoolName;
        this.batch= batch;
        this.year=year;
        this.lastDayofClass=lastDayofClass;
    }
    public void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayofClass);
    }

    public static void main(String[] args) {
        repl142 st= new repl142();
        st.display();
        repl142 st1= new repl142("Syntax",6,2020,"07/30/2020");
        st1.display();
    }
}
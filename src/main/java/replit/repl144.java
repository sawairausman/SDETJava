package replit;

public class repl144 {

        public static void main(String [] args){
            StoreProduct sp1= new StoreProduct("Eggs",3.0,"Produce",true,10);
            sp1.displayOutput();
            StoreProduct sp2= new StoreProduct("Paper Towels",2.0,24);
            sp2.displayOutput();
            StoreProduct sp3= new StoreProduct("Paper Towels",2.0);
            sp3.displayOutput();

        }

    }

class StoreProduct{
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock ){

        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    StoreProduct(String label, double price, int stock){
        this.label = label;
        this.price = price;
        this.stock = stock;
        this.hasExpiration= false;
        this.category= "misc";
    }

    StoreProduct(String label, double price){
        this.label = label;
        this.price = price;
        this.hasExpiration= false;
        this.stock = 0;

    }

    public void displayOutput(){
        System.out.println(label +" "+price+" "+category+" "+hasExpiration+" "+stock);
    }

}








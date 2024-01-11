package replit;

public class repl147 {
    private String model;
    private double price;
    private int quantity;

    repl147(String model, double price, int quantity){
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public double carStockValue(){
        double value =0;
        value = quantity*price;
        return value;
    }
    public void display(){
        System.out.println(model+" Stock Value "+carStockValue());
    }

    public static void main(String[] args) {
        repl147 c1 = new repl147("Toyata 2019",50000,50);
        c1.display();
        repl147 c2 = new repl147("BMW 2019",65298,10);
        c2.display();
    }
}

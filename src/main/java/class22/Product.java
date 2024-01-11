package class22;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }


    public String getProductID(String name){
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    int totalrestock=0;

    public double restock(int amount){
        totalrestock =amount+getStockQuantity();
        System.out.println("total restock adding "+amount+" more is "+(amount+getStockQuantity()));
        return totalrestock;


    }
    int newtotalrestock=0;
    public double sell(int amount){
       if(amount<=getStockQuantity()){
         newtotalrestock = totalrestock - amount;
           return amount*price;
           //System.out.println("Total sale price of "+ getProductName()+ " $"+sell(10));
       }else{
           return 0;
       }

    }
    public void printProductDetail(){
        System.out.println("Product name: "+getProductName()+" Product Id: "+getProductID("1")+" "+"Price $"+getPrice()+" "+"Stock quantity: "+getStockQuantity()+" ");
    }
    public void printNewTotalRestock(){
        System.out.println("Product name: "+getProductName()+" Product Id: "+getProductID("1")+" "+"Price $"+getPrice()+" new Stock Quantity is: "+newtotalrestock);

    }

}

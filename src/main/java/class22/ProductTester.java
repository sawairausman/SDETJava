package class22;

public class ProductTester {
    public static void main(String[] args) {

        Product p1= new Product("1", "Sony TV" , 499.9,50);
        p1.printProductDetail();
       // p1.setStockQuantity(5);
        p1.restock(5);
        System.out.println("Total sale price of "+ p1.getProductName()+ " $"+p1.sell(10));
        p1.printNewTotalRestock();



    }
}

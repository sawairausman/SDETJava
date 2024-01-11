package Homework;
//2)Online Shopping Cart:
//
//        Construct a class Product with attributes like product_name, price, and quantity.
//        Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
//        Override a method in DiscountedProduct to calculate the price after applying the discount.
//        Create instances of both classes and show how prices are calculated
//        3)Library Management System:

///OVERRIDING CONCEPT

public class Product {
    private String product_name;
    private double price;
    private int quantity;
    double discountedPrice;


    public Product(String product_name, double price, int quantity) {
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }
    public void Discount(double discount){

         double totalPrice = price* quantity;
         discountedPrice =(totalPrice-(totalPrice*(discount/100)));
        System.out.println("Total price for "+quantity+" "+product_name+ " is "+totalPrice+" after discount of "+discount+"% is "+discountedPrice);



    }

}

class DiscountedProduct extends Product{

    private double discountRate;
    public DiscountedProduct(String product_name, double price, int quantity,int discountRate) {
        super(product_name, price, quantity);
        this.discountRate=discountRate;
    }

    public void Discount(double discount){
        super.Discount(discount);

        System.out.println("Additional discount of "+discountRate+"% & new price is $"+(discountedPrice-(discountedPrice*(discountRate/100))));


    }

}

class ProductTester{
    public static void main(String[] args) {
        new Product("TV",799.9,2).Discount(25);
        new DiscountedProduct("Open Boxed TV",799.9,2,20).Discount(25);
    }
}
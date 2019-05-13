package home_works.lesson6hw1.java;

public class OrderDetails {
    private long orderId;
    private Products products;
    private double unitPrice;
    private int quantity;
    private int discount;

    public OrderDetails(long orderId, Products products, double unitPrice, int quantity, int discount) {
        this.orderId = orderId;
        this.products = products;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}

package home_works.lesson6hw1.java;

public class Products {
    private long productId;
    private String productName;
    private Suppliers suppliers;
    private Categories categories;
    private int quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private int discontinued;

    public Products(long productId, String productName, Suppliers suppliers, Categories categories, int quantityPerUnit, double unitPrice, int unitsInStock, int unitsOnOrder, int reorderLevel, int discontinued) {
        this.productId = productId;
        this.productName = productName;
        this.suppliers = suppliers;
        this.categories = categories;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }
}

package home_works.lesson6hw1.java;

import java.util.Date;

public class Orders {
    private long ordersId;
    private Customers customers;
    private Employees employees;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVIA;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private int shipPostalCode;
    private String shipCountry;

    public Orders(long ordersId, Customers customers, Employees employees, Date orderDate, Date requiredDate, Date shippedDate, String shipVIA, String freight, String shipName, String shipAddress, String shipCity, String shipRegion, int shipPostalCode, String shipCountry) {
        this.ordersId = ordersId;
        this.customers = customers;
        this.employees = employees;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVIA = shipVIA;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }
}

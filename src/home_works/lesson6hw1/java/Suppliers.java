package home_works.lesson6hw1.java;

public class Suppliers {
    private long supplierId;
    private String companyName;
    private String contactName;
    private String address;
    private String city;
    private String region;
    private int postal_code;
    private String country;
    private int phone;
    private int fax;
    private String homePage;

    public Suppliers(long supplierId, String companyName, String contactName, String address, String city, String region, int postal_code, String country, int phone, int fax, String homePage) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.homePage = homePage;
    }
}

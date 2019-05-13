package home_works.lesson6hw1.java;

public class Customers {
    private long customerId;
    private String companyName;
    private String contactName;
    private String contactTytle;
    private String address;
    private String city;
    private String region;
    private int postal_code;
    private String country;
    private int phone;
    private int fax;

    public Customers(long customerId, String companyName, String contactName, String contactTytle, String address, String city, String region, int postal_code, String country, int phone, int fax) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTytle = contactTytle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }
}

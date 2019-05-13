package home_works.lesson6hw1.java;

import java.util.Date;

public class Employees {
    private long employeeId;
    private String lastName;
    private String firstName;
    private String tytle;
    private String tytleOfCourtesy;
    private Date birthDay;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private int postal_code;
    private String country;
    private int phone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;

    public Employees(long employeeId, String lastName, String firstName, String tytle, String tytleOfCourtesy, Date birthDay, Date hireDate, String address, String city, String region, int postal_code, String country, int phone, String extension, String photo, String notes, String reportsTo) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.tytle = tytle;
        this.tytleOfCourtesy = tytleOfCourtesy;
        this.birthDay = birthDay;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.country = country;
        this.phone = phone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }
}

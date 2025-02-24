package Hibernate;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "student_Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int addressId;
    private String city;
    private String street;
    private boolean isOpen;

    @Transient
    private double x;

    @Column(name="Added_Date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob
    private byte[] image;


    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }



    public byte[] getImage() {
        return image;
    }

    @Override
    public String toString() {
        return addressId+":" + city+":"+ street ;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}

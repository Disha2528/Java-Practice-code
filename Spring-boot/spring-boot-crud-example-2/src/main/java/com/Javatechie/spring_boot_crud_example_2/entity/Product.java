package com.Javatechie.spring_boot_crud_example_2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    int Id;

    String Name;
    int quantity;
    Double Price;

    public Product() {
    }

    public Product(int id, String name, int quantity, Double price) {
        Id = id;
        Name = name;
        this.quantity = quantity;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString(){
        return " Name: "+ Name;
    }
}

package Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import org.hibernate.sql.results.graph.collection.internal.EagerCollectionFetch;


@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private String city;

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    private Certificate certi;

    public Student(int id, String city, String name, Certificate certi) {
        this.city = city;
        this.name = name;
        this.id = id;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name"+":"+ this.name+" "+ "City"+":"+ this.city+" "+ "Id"+":"+this.id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

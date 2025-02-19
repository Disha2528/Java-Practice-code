package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class App {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello World!");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Load Hibernate config


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println("Hibernate SessionFactory created successfully!");

        //Creating Student
        Student st= new Student();
        st.setId(29);
        st.setName("Disha");
        st.setCity("Mumbai");
        System.out.println(st);

        Student st2 = new Student();
        st2.setId(31);
        st2.setName("Amit");
        st2.setCity("Delhi");

        Student st3 = new Student();
        st3.setId(45);
        st3.setName("Neha");
        st3.setCity("Bangalore");

        Student st4 = new Student();
        st4.setId(52);
        st4.setName("Raj");
        st4.setCity("Kolkata");

        Student st5 = new Student();
        st5.setId(67);
        st5.setName("Pooja");
        st5.setCity("Pune");


        //Creating object of Address
        Address ad= new Address();
        ad.setAddressId(10);
        ad.setCity("Amd");
        ad.setAddedDate(new Date());
        ad.setOpen(true);
        ad.setX(123.123);
        ad.setStreet("Andheri");


        FileInputStream fis = new FileInputStream("src/main/java/Hibernate/pic.png") ;
        byte[] data= new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);

        System.out.println(ad);

        Session session= sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(ad);
        session.save(st);
        session.save(st2);
        session.save(st3);
        session.save(st4);
        session.save(st5);

        tx.commit();
        session.close();



        sessionFactory.close();

    }
}

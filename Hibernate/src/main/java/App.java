
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import java.io.PrintStream;


public class App {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello World!");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Load Hibernate config


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println("Hibernate SessionFactory created successfully!");

        //Creating Student
        Student st= new Student();
        st.setId(24);
        st.setName("Disha");
        st.setCity("Mumbai");
        System.out.println(st);

        //Creating object of Address
        Address ad= new Address();
        ad.setAddressId(1);
        ad.setCity("Amd");
        ad.setAddedDate(new Date());
        ad.setOpen(true);
        ad.setX(123.123);
        ad.setStreet("Andheri");


        FileInputStream fis = new FileInputStream("src/main/java/pic.png") ;
        byte[] data= new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);

        System.out.println(ad);

        Session session= sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(ad);
        session.save(st);
        tx.commit();
        session.close();



        sessionFactory.close();

    }
}

package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        // Create Configuration instance and configure Hibernate
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Load Hibernate config

        // Build SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();

        Student student = (Student)session.get(Student.class,23);
        Address address = (Address)session.get(Address.class, 1);

        System.out.print(student);
        System.out.print(address);

        session.close();

        // Close SessionFactory to release resources
        sessionFactory.close();
    }
}
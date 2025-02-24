package HQLqueries;

import Hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class HQLExample {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Load Hibernate config
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        String query= "from Student ";
        Query q= session.createQuery(query);
        List<Student> ans= q.list();

        for(Student s: ans){
            System.out.println(s.getName());
        }

        session.close();
        sessionFactory.close();

    }
}

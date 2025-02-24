package HQLqueries;

import Hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class pagination {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        String query = "from Student";

        Query<Student> q = session.createQuery(query, Student.class);

        q.setFirstResult(8);
        q.setMaxResults(18);

        List<Student> ans = q.list();

        for (Student s : ans) {
            System.out.println(s.getName());
        }

        session.close();
        sessionFactory.close();
    }
}

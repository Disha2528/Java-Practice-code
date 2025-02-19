package HibernateMap.manyTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        Emp e1= new Emp();
        Emp e2= new Emp();
        Emp e3 = new Emp();

        e1.setEid(110);
        e1.setEname("Disha");

        e2.setEid(111);
        e2.setEname("Alice");

        e3.setEid(112);
        e3.setEname("John");

        Project p1=new Project();
        Project p2=new Project();
        Project p3=new Project();

        p1.setPid(1);
        p1.setPname("Library");

        p2.setPid(2);
        p2.setPname("Hotel");

        p3.setPid(3);
        p3.setPname("Hospital");

        List<Emp> em= new ArrayList<>();
        List<Emp> em1= new ArrayList<>();
        List<Emp> em2= new ArrayList<>();

        List<Project> pr= new ArrayList<>();
        List<Project> pr1= new ArrayList<>();
        List<Project> pr2= new ArrayList<>();

        em.add(e1);
        em.add(e2);
        em1.add(e2);
        em1.add(e3);
        em2.add(e1);
        em2.add(e3);

        pr.add(p1);
        pr.add(p3);
        pr1.add(p2);
        pr1.add(p1);
        pr2.add(p3);
        pr2.add(p2);

        p1.setE(em);
        p2.setE(em1);
        p3.setE(em2);

        e1.setP(pr);
        e2.setP(pr1);
        e3.setP(pr2);

        // Opening Hibernate session
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        // Saving data into the database
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(e1);
        session.save(e2);
        session.save(e3);

        // Committing transaction and closing session
        tx.commit();
        session.close();
        sessionFactory.close();



    }
}

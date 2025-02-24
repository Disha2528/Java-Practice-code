package HibernateMap.oneToone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Load Hibernate config

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Question q1= new Question();
        q1.setqId(112);
        q1.setQuestion("What is Java?");

        Question q2= new Question();
        q2.setqId(115);
        q2.setQuestion("what is Collections Framework?");

        Answer a1= new Answer();
        a1.setaId(181);
        a1.setAnswer("Java is a Programming Language");

        Answer a2= new Answer();
        a2.setaId(183);
        a2.setAnswer("An API to work with Java Objects");

        q1.setAnswer(a1);
        q2.setAnswer(a2);

        Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(q1);
        session.save(a1);
        session.save(q2);
        session.save(a2);
        tx.commit();
        session.close();
        sessionFactory.close();

    }
}

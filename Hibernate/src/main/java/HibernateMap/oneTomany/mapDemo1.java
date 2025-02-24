package HibernateMap.oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class mapDemo1 {

    public static void main(String[] args) {

        // Initialize Hibernate configuration
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Creating Question object
        Question1 q1 = new Question1();
        q1.setqId(112);
        q1.setQuestion("What is Java?");

        // Creating Answer objects
        Answer1 a1 = new Answer1();
        a1.setaId(181);
        a1.setAnswer("Java is a Programming Language");
        a1.setQuestion(q1);  // ✅ Corrected

        Answer1 a2 = new Answer1();
        a2.setaId(182);
        a2.setAnswer("Java helps us build Software");
        a2.setQuestion(q1);  // ✅ Corrected

        Answer1 a3 = new Answer1();
        a3.setaId(183);
        a3.setAnswer("Java has Frameworks");
        a3.setQuestion(q1);  // ✅ Corrected

        // Adding answers to the question
        List<Answer1> ans = new ArrayList<>();
        ans.add(a1);
        ans.add(a2);
        ans.add(a3);
        q1.setAnswer(ans);

        // Opening Hibernate session
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        // Saving data into the database
        session.save(q1);
        session.save(a1);
        session.save(a2);
        session.save(a3);

        // Committing transaction and closing session
        tx.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Data saved successfully!");
    }
}

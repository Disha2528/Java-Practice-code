package Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

public class EmDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory factory= new Configuration().configure().buildSessionFactory();

        //student obj
        Student st1 = new Student();
        st1.setId(1);
        st1.setName("Alice");
        st1.setCity("Ahemdabad");
        Certificate certi1 = new Certificate();
        certi1.setCourse("CSE");
        certi1.setDuration("4 Years");
        st1.setCerti(certi1);

        Student st2 = new Student();
        st2.setId(2);
        st2.setName("Bob");
        st2.setCity("Mumbai");
        Certificate certi2 = new Certificate();
        certi2.setCourse("IT");
        certi2.setDuration("3 Years");
        st2.setCerti(certi2);

        Student st3 = new Student();
        st3.setId(3);
        st3.setName("Charlie");
        st3.setCity("Delhi");
        Certificate certi3 = new Certificate();
        certi3.setCourse("AI & ML");
        certi3.setDuration("4 Years");
        st3.setCerti(certi3);

        Student st4 = new Student();
        st4.setId(4);
        st4.setName("David");
        st4.setCity("Bangalore");
        Certificate certi4 = new Certificate();
        certi4.setCourse("Electronics");
        certi4.setDuration("3 Years");
        st4.setCerti(certi4);

        Student st5 = new Student();
        st5.setId(5);
        st5.setName("Eva");
        st5.setCity("Chennai");
        Certificate certi5 = new Certificate();
        certi5.setCourse("Mechanical");
        certi5.setDuration("4 Years");
        st5.setCerti(certi5);

        Student st6 = new Student();
        st6.setId(6);
        st6.setName("Fay");
        st6.setCity("Kolkata");
        Certificate certi6 = new Certificate();
        certi6.setCourse("Civil");
        certi6.setDuration("5 Years");
        st6.setCerti(certi6);

        Student st7 = new Student();
        st7.setId(7);
        st7.setName("Grace");
        st7.setCity("Hyderabad");
        Certificate certi7 = new Certificate();
        certi7.setCourse("MBA");
        certi7.setDuration("2 Years");
        st7.setCerti(certi7);

        Student st8 = new Student();
        st8.setId(8);
        st8.setName("Hank");
        st8.setCity("Pune");
        Certificate certi8 = new Certificate();
        certi8.setCourse("Data Science");
        certi8.setDuration("3 Years");
        st8.setCerti(certi8);

        Student st9 = new Student();
        st9.setId(9);
        st9.setName("Ivy");
        st9.setCity("Surat");
        Certificate certi9 = new Certificate();
        certi9.setCourse("BBA");
        certi9.setDuration("4 Years");
        st9.setCerti(certi9);

        Student st10 = new Student();
        st10.setId(10);
        st10.setName("Jack");
        st10.setCity("Jaipur");
        Certificate certi10 = new Certificate();
        certi10.setCourse("Finance");
        certi10.setDuration("3 Years");
        st10.setCerti(certi10);

        Student st11 = new Student();
        st11.setId(11);
        st11.setName("Kim");
        st11.setCity("Ahemdabad");
        Certificate certi11 = new Certificate();
        certi11.setCourse("CSE");
        certi11.setDuration("4 Years");
        st11.setCerti(certi11);

        Student st12 = new Student();
        st12.setId(12);
        st12.setName("Liam");
        st12.setCity("Mumbai");
        Certificate certi12 = new Certificate();
        certi12.setCourse("IT");
        certi12.setDuration("3 Years");
        st12.setCerti(certi12);

        Student st13 = new Student();
        st13.setId(13);
        st13.setName("Mia");
        st13.setCity("Delhi");
        Certificate certi13 = new Certificate();
        certi13.setCourse("AI & ML");
        certi13.setDuration("4 Years");
        st13.setCerti(certi13);

        Student st14 = new Student();
        st14.setId(14);
        st14.setName("Noah");
        st14.setCity("Bangalore");
        Certificate certi14 = new Certificate();
        certi14.setCourse("Electronics");
        certi14.setDuration("3 Years");
        st14.setCerti(certi14);

        Student st15 = new Student();
        st15.setId(15);
        st15.setName("Olivia");
        st15.setCity("Chennai");
        Certificate certi15 = new Certificate();
        certi15.setCourse("Mechanical");
        certi15.setDuration("4 Years");
        st15.setCerti(certi15);

        Student st16 = new Student();
        st16.setId(16);
        st16.setName("Paul");
        st16.setCity("Kolkata");
        Certificate certi16 = new Certificate();
        certi16.setCourse("Civil");
        certi16.setDuration("5 Years");
        st16.setCerti(certi16);

        Student st17 = new Student();
        st17.setId(17);
        st17.setName("Quincy");
        st17.setCity("Hyderabad");
        Certificate certi17 = new Certificate();
        certi17.setCourse("MBA");
        certi17.setDuration("2 Years");
        st17.setCerti(certi17);

        Student st18 = new Student();
        st18.setId(18);
        st18.setName("Rachel");
        st18.setCity("Pune");
        Certificate certi18 = new Certificate();
        certi18.setCourse("Data Science");
        certi18.setDuration("3 Years");
        st18.setCerti(certi18);

        Student st19 = new Student();
        st19.setId(19);
        st19.setName("Sam");
        st19.setCity("Surat");
        Certificate certi19 = new Certificate();
        certi19.setCourse("BBA");
        certi19.setDuration("4 Years");
        st19.setCerti(certi19);

        Student st20 = new Student();
        st20.setId(20);
        st20.setName("Tom");
        st20.setCity("Jaipur");
        Certificate certi20 = new Certificate();
        certi20.setCourse("Finance");
        certi20.setDuration("3 Years");
        st20.setCerti(certi20);


        Student st21 = new Student();
        st21.setId(21);
        st21.setName("Anna");
        st21.setCity("Mumbai");
        Certificate certi21 = new Certificate();
        certi21.setCourse("CSE");
        certi21.setDuration("4 Years");
        st21.setCerti(certi21);

        Student st22 = new Student();
        st22.setId(22);
        st22.setName("Ben");
        st22.setCity("Bangalore");
        Certificate certi22 = new Certificate();
        certi22.setCourse("IT");
        certi22.setDuration("3 Years");
        st22.setCerti(certi22);



        Session session= factory.openSession();

        Transaction tx= session.beginTransaction();
        session.save(st2);
        session.save(st3);
        session.save(st5);
        session.save(st6);
        session.save(st7);
        session.save(st1);
        session.save(st4);
        session.save(st8);
        session.save(st9);
        session.save(st10);
        session.save(st11);
        session.save(st16);
        session.save(st12);
        session.save(st13);
        session.save(st14);
        session.save(st15);
        session.save(st17);
        session.save(st18);
        session.save(st19);
        session.save(st20);
        session.save(st21);
        session.save(st22);
        tx.commit();

        session.close();
        factory.close();


    }
}

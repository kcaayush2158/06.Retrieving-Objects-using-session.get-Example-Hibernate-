package com.application.main;

import com.application.pojo.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("aayush kc");

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();
    }
}

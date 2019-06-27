package com.application.main;

import com.application.pojo.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        UserDetails user = new UserDetails();
        user.setId(1);
        user.setUsername("aayush");
        user.setAddress("gaushala");
        user.setJoinedDate(new Date());
        user.setDescription("Discription of the user goes here");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(user);
        session.getTransaction().commit();
        session.close();
        user= null;
        session = sessionFactory.openSession();
        session.beginTransaction();
      user = (UserDetails) session.get(UserDetails.class,1);
      System.out.println(user.getId()+"\t"+user.getUsername());
      session.close();
    }
}

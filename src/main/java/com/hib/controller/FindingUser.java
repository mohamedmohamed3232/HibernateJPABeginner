package com.hib.controller;

import com.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindingUser {
    public void findUser() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        int USER_ID = 14;
        User u = session.load(User.class, USER_ID);
        System.out.println("Fullname: " + u.getFullname());
        System.out.println("Email: " + u.getEmail());
        System.out.println("password: " + u.getPassword());

        //Close resources
        t.commit();
        factory.close();
        session.close();


    }
}
